public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        HashMap<Character,Integer> charToIndex = new HashMap<Character, Integer>();
        charToIndex.put(s.charAt(0),0);
        int currLen = 1;
        int maxLen = 0;
        for(int i=1; i<s.length();i++){
            if(charToIndex.get(s.charAt(i))!=null){
                int repeatIndex = charToIndex.get(s.charAt(i));
                charToIndex.put(s.charAt(i),i);
                if((i-currLen)> repeatIndex){
                   currLen++;
                }else{
                   if(maxLen<currLen){
                      maxLen = currLen;
                   }
                   currLen = i - repeatIndex;
                }
            }else{
                charToIndex.put(s.charAt(i),i);
                currLen++;
            }
        }
        if(currLen > maxLen){
           maxLen = currLen;
        }
        return maxLen;
    }
}
