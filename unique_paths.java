public class Solution {
    int[][] M;
    public int uniquePaths(int m, int n) {
        if(m==0 ||n==0)
            return 0;
        if(m==1 || n==1)
            return 1;
        init(m,n);
        return calNumOfPaths(m-1,n-1);
    }
    
    public int calNumOfPaths(int i, int j){
        if(M[i][j]!= -1){
            return M[i][j];
        }else{
            if(i==0 || j==0){
                M[i][j]=1;
                return 1;
            }
            M[i][j] = calNumOfPaths(i-1, j) + calNumOfPaths(i, j-1);
            return M[i][j];
        }
    }
    
    public void init(int m, int n){
        M = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                M[i][j]=-1;
            }
        }
    }
}
