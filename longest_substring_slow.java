public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        HashMap<Character,Integer> substrings = new HashMap<Character, Integer>();
        int longest = 0;
        substrings.put(s.charAt(0),0);
        for(int i=1; i<s.length();i++){
            if(substrings.get(s.charAt(i))!=null){
                if(substrings.size()>longest){
                    longest = substrings.size();
                }
                i=substrings.get(s.charAt(i));
                substrings = new HashMap<Character, Integer>();
            }else{
                substrings.put(s.charAt(i),i);
            }
        }
        return longest;
    }
}
