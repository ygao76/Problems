public class Solution {
    public int maxProduct(int[] A) {
        if(A==null){
            return 0;
        }
        int min = Math.min(A[0],0);
        int max = Math.max(A[0],0);
        int maxProduct = A[0];
        for(int i=1; i<A.length;i++){
            if(A[i]>0){
                max = Math.max(A[i],A[i]*max);
                min = A[i]*min;
            }else{
                int temp = Math.min(A[i], A[i]*max);
                max = A[i]*min;
                min = temp;
            }
            if(max>maxProduct){
                maxProduct = max;
            }
        }  
        return maxProduct;
    }
}
