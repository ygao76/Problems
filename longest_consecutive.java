public class Solution {
    public int longestConsecutive(int[] num) {
        if(num==null ||num.length==0){
            return 0;
        }
        if(num.length==1){
            return 1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int number: num){
            if(number<min){
                min = number;
            }
            if(number>max){
                max = number;
            }
        }
        if(min == Integer.MAX_VALUE ){
            min = max;
        }
        if(max == Integer.MIN_VALUE){
            max = min;
        }
        if(min == max){
            return 1;
        }
        int[] dict = new int[max - min+1];
        for(int number: num){
            dict[number-min] = 1;
        }
        int maxLen = 0;
        int currLen = 0;
        for(int i=0;i<dict.length;i++){
            if(dict[i]==1){
                currLen++;
            }else{
                if(currLen>maxLen){
                    maxLen = currLen;
                }
                //reset currLen
                currLen = 0;
            }
        }
        return maxLen;
    }
}
