public class Solution {
    public int majorityElement(int[] num) {
        int vote = num[0];
        int count = 0;
        for(int number:num){
            if(count==0){
                vote = number;
                count++;
            }else{
                if(number == vote){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return vote;
    }
}
