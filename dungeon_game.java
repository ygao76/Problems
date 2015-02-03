public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon==null|| dungeon.length==0){
            return 0;
        }
        int m = dungeon.length;
        int n = dungeon[0].length;

        int[][] health = new int[m][n];
        health[0][0] = dungeon[m-1][n-1];
        for(int i=1;i<m;i++){
            if(dungeon[m-i-1][n-1]<0 && health[i-1][0]>0){
                health[i][0] = dungeon[m-i-1][n-1];
            }else
                health[i][0] = dungeon[m-i-1][n-1] +health[i-1][0];
        }
        for(int j=1; j<n;j++){
            if(dungeon[m-1][n-j-1]<0 && health[0][j-1] >0){
                health[0][j] = dungeon[m-1][n-j-1];
            }else
                health[0][j] = dungeon[m-1][n-j-1] + health[0][j-1];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int previousMinHealth = Math.max(health[i-1][j], health[i][j-1]);
                if(dungeon[m-i-1][n-j-1]<0 && previousMinHealth>0)
                    health[i][j] = dungeon[m-i-1][n-j-1];
                else
                    health[i][j] = previousMinHealth+dungeon[m-i-1][n-j-1];
            }
        }
        if(health[m-1][n-1]>=0){
            return 1;
        }else{
            return -1*health[m-1][n-1] +1;
        }
    }
}
