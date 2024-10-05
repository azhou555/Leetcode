public class freedomTrail {
    public int findRotateSteps(String ring, String key){
        int[] dp = new int[key.length()];
        for(int i = 0; i< dp.length; i++){
            dp[i] = i;
        }
        return dp[dp.length-1];
    }
    public int helper(String ring, String key, int index){
        return index;
    }
}