public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0){
            return true;
        }
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        char[] charArray = s.toCharArray();
        for(int i=0; i<Math.ceil(charArray.length/2);i++){
            if(charArray[i] != charArray[charArray.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
