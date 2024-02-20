public class uniquePathsII{
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[0][0] = obstacleGrid[0][0] == 0 ? 0 : 1;
        for(int i = 0; i < obstacleGrid.length; i++){
            for(int j = 0; j < obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j] != 1){
                    if(i-1 >= 0 && dp[i-1][j] != 0){
                        dp[i][j] += dp[i-1][j];
                    } if(j-1 >= 0 && dp[i][j-1] != 0){
                        dp[i][j] += dp[i][j-1];
                    }
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}