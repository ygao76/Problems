public class Solution {
    public int maxSubArray(int[] A) {
        if(A==null){
            return 0;
        }
        int[] sum = new int[A.length];
        sum[0] = A[0];
        int max = A[0];
        for(int i=1; i<A.length;i++){
            sum[i] = Math.max(sum[i-1]+A[i], A[i]);
            if(sum[i]>max){
                max = sum[i];
            }
        }
        return max;
    }
}
