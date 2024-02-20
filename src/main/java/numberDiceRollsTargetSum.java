public class numberDiceRollsTargetSum {
    public int numRollsToTarget(int n, int k, int target){
        int[][] dp = new int[n+1][target+1];
        return numRollsToTargetHelper(dp, n, k, target);
    }
    public int numRollsToTargetHelper(int[][] dp, int n, int k, int target){
        if(target < 0){
            return 0;
        }
        int res = 0;
        if(n > 1){
            if(dp[n][target] != 0){
                return dp[n][target];
            }
            for(int i = 1; i< k || i< target; i++){
                res += numRollsToTargetHelper(dp, n-1, k, target-i);
                res = res %((int) Math.pow(10, 9)+7);
            }
        } else{
            res = target <= k ? 1 : 0;
        }
        dp[n][target] = res;
        return res;
    }
}
