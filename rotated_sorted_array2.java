public class Solution {
    public int findMin(int[] num) {
        int low = 0;
        int high = num.length -1;
        while(low < high){
            int mid = (low + high)/2;
            if(low !=high && num[low]==num[high] && num[mid]==num[high]){
                int newMid= mid+1;
                while(newMid<high){
                    if(num[newMid]!=num[high]){
                        break;
                    }
                    newMid++;
                }
                if(newMid==high){
                    high=mid;
                    continue;
                }else{
                    mid = newMid;
                }
                
            }
            if(num[low]<=num[mid] && num[mid]>num[high]){
                low = mid+1;
            }
            if(num[low]>num[mid]&& num[mid]<= num[high]){
                high = mid;
            }if(num[low]<num[high]){
                break;
            }
        }
        return num[low];
    }
}
