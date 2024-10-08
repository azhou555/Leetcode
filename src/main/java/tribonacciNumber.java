public class tribonacciNumber{
    public int tribonacci(int n){
        if(n <= 2){
            return Math.min(n, 1);
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i< n+1; i++){
            dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}