public class Solution {
    public String convert(String s, int nRows) {
        StringBuilder sb = new StringBuilder();
        if(nRows==1){
            return s;
        }
        for(int row=0; row< nRows;row++){
            int index = row;
            int rowIndex = 0;
            while(index < s.length()){
                sb.append(s.charAt(index));
                int interval = 2*(nRows-row )-2;
                if(interval ==0 || ( 2*nRows-2-interval)==0){
                    index = index + 2*nRows-2;
                    continue;
                }
                rowIndex++;
                if(isOdd(rowIndex)){
                    index = index + interval;
                }else {
                    index = index + 2*nRows-2-interval;
                }
            }
        }
        return sb.toString();
    }
    
    public boolean isOdd(int number){
       // return (number & 1) != 0;
       if (number % 2 == 0){
           return false;
       }else{
           return true;
       }
    }
}
