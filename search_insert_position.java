public class Solution {
    public int searchInsert(int[] A, int target) {
        int low = 0;
        int high = A.length-1;
        
        while(low<=high){
            int mid = (high+low)/2;
            if(A[mid] == target){
                return mid;
            }
            if(A[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
//when low==high, they always points at the closest element that is larger or equal to target
//step before low==high, its low +1 == high, mid ==low, mid will be smaller or equal to target, low will move to high
