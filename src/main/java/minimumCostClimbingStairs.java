public class minimumCostClimbingStairs{
    public int minCostClimbingStairs(int[] cost){
        if(cost.length == 0){
            return 0;
        } else if(cost.length == 1){
            return cost[0];
        } else if(cost.length == 2){
            return Math.min(cost[0], cost[1]);
        }
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i< dp.length; i++){
            dp[i] = cost[i]+Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[dp.length-1], dp[dp.length-1]);
    }
}
