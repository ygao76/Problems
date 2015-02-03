public class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0 || s.equals("0")){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int[] msg = convertToInteger(s);
        if(msg[0]==0){
            return 0;
        }
        int previousWays = 1;
        int previousWays2 = 1;
        for(int i=1; i<msg.length;i++){
            int currWays;
            if(msg[i]==0){
                if(msg[i-1]==1|| msg[i-1]==2){
                    currWays = previousWays2;
                }else{
                    return 0;
                }
            }else{
                currWays = previousWays;
                if(msg[i-1]*10+msg[i] <= 26 && msg[i-1]*10+msg[i]>=10)
                    currWays +=previousWays2;
            }
            previousWays2 = previousWays;
            previousWays = currWays;
        }
        return previousWays;
            
    }
    
    public int[] convertToInteger(String s){
        int [] nums = new int[s.length()];
        for(int i=0;i<s.length();i++){
           nums[i] = Character.getNumericValue(s.charAt(i));
        }
        return nums;
    }
}
