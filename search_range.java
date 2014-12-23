public class Solution {
    public int[] searchRange(int[] A, int target) {
        int low = 0;
        int high = A.length-1;
        int mid=0;
        while(low<=high){
            mid = (low+high)/2;
            if(A[mid]==target){
                break;
            }else if(A[mid] >target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(low>high){
            return new int[]{-1,-1};
        }
        int[] result = new int[2];
        int start = 0;
        int end = mid;
        while(start<=end){
            mid = (start+end)/2;
            if(A[mid]==target){
                end = mid-1;
            }else if(A[mid]<target && A[mid+1]==target){
                result[0]=mid+1;
                break;
            }else{
                start = mid+1;
            }
        }
        if(end<0){
            result[0]=0;
        }
        start = mid+1;
        end = A.length-1;
        while(start<=end){
            mid = (start+end)/2;
            if(A[mid]==target){
                start = mid+1;
            }else if(A[mid]>target &&A[mid-1]==target){
                result[1]=mid-1;
                break;
            }else{
                end = mid-1;
            }
        }
        if(start>(A.length-1)){
            result[1]=A.length-1;
        }
        return result;
    }
}
