public class Solution {
    public int minCut(String s) {
        List<List<String>> allPalidromPartition = new ArrayList<List<String>>();
        if(s==null || s.length()==0){
            return 0;
        }else if(s.length()==1){
            return 0;
        }else{
            int substringMinCut = Integer.MAX_VALUE;
            for(int i=s.length()-1; i>=0;i--){
                String substring = s.substring(0,i+1);
                if(isPalindrome(substring)){
                    if(i==s.length()-1){
                        return 0;
                    }else{
                        substringMinCut = Math.min(substringMinCut, minCut(s.substring(i+1)));
                    }
                }
            }
            return substringMinCut+1;
        }
    }
    
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] charArray = s.toCharArray();
        for(int i=0; i<Math.ceil(charArray.length/2);i++){
            if(charArray[i] != charArray[charArray.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
