public class Solution {
    public boolean canJump(int[] A) {
        if(A==null){
            return false;
        }
        int max = 0;
        for(int i=0;i<A.length && i<=max;i++){
            max = Math.max(A[i]+i,max);
        }
        return max >= A.length-1;
    }
}
