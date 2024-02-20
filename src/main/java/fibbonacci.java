public class fibbonacci {
    public int fib(int n){
        if (n <= 2){
            return Math.min(n, 1);
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i< n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}
