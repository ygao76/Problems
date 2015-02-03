public class Solution {
    int[][] M;
    int m;
    int n;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null)
            return 0;
        init(obstacleGrid);
        return calNumOfPaths(m-1,n-1);
    }
    
    public int calNumOfPaths(int i, int j){
        if(M[i][j]!= -1){
            return M[i][j];
        }else{
            if(i==0 && j==0){
                M[i][j]=1;
                return 1;
            }
            if(j==0){
                M[i][j]= calNumOfPaths(i-1, j);
                return M[i][j];
            }
            if(i==0){
                M[i][j]= calNumOfPaths(i,j-1);
                return M[i][j];
            }
            M[i][j] = calNumOfPaths(i-1, j) + calNumOfPaths(i, j-1);
            return M[i][j];
        }
    }
    
    public void init(int[][] obstacleGrid){
        m = obstacleGrid.length;
        n = obstacleGrid[0].length;
        M = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==0)
                    M[i][j]=-1;
            }
        }
    }
}
