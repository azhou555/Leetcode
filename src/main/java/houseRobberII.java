public class houseRobberII {
    public int rob(int[] nums){
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0], nums[1]);
        return Math.max(rob_helper(nums, 0, nums.length-1), rob_helper(nums, 1, nums.length));
    }
    public int rob_helper(int[] nums, int start, int end) {
        int[] dp = new int[end-start];
        dp[0]=nums[start];
        if (nums[start] > nums[start+1]){
            dp[1] = nums[start];
        }
        else{
            dp[1] = nums[start+1];
        }
     
        for(int i=start+2; i<end; i++){
            if (dp[i-2-start]+nums[i] > dp[i-start-1]){
                dp[i-start] = dp[i-start-2]+nums[i];
            }
            else{
                dp[i-start] = dp[i-start-1];
            }
        }
     
        return dp[dp.length-1];
    }
}
