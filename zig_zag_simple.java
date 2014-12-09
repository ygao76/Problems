public class Solution {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuffer res = new StringBuffer();
        int base = 2*(nRows-1);
        char[] c = s.toCharArray();
        for(int i=0;i<nRows;i++){
                int index = i;
                int diff = base-i-i;
                while(index<c.length){
                    res.append(c[index]);
                    if(i!=0&&i!=(nRows-1)&&(index+diff)<c.length)
                        res.append(c[index+diff]);
                    index += base;
                }
           
        }
        return res.toString();
    }
}
