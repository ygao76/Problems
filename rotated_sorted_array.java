public class Solution {
    public int findMin(int[] num) {
        int low = 0;
        int high = num.length-1;
        while(low < high){
            int mid = (high + low)/2;
            if(num[low]<= num[mid] && num[mid]>num[high]){
                //pivot in upper half
                low = mid+1;
            }else if(num[low]<= num[mid] && num[mid]<num[high]){
                return num[low];
            }else{
                high = mid;
            }
        }
        return num[low];
    }
}
