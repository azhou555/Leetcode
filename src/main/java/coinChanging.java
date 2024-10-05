public class coinChanging {
    public int coinChange(int[] coins, int amount){
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i = 1; i< amount+1; i++){
            int count_coins = amount+1;
            for(int c: coins){
                if(i-c >= 0){
                    count_coins = Math.min(count_coins, 1+dp[i-c]);
                }
            }
            dp[i] = count_coins;
        }
        return dp[amount] != amount+1 ? dp[amount] : -1;
    }
}
