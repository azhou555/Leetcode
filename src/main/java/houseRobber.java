public class houseRobber {
    public int rob(int[] nums) {
        if(nums.length==0)
            return 0;
     
        if(nums.length==1)
            return nums[0];
     
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        if (nums[0] > nums[1]){
            dp[1] = nums[0];
        }
        else{
            dp[1] = nums[1];
        }
     
        for(int i=2; i<nums.length; i++){
            if (dp[i-2]+nums[i] > dp[i-1]){
                dp[i] = dp[i-2]+nums[i];
            }
            else{
                dp[i] = dp[i-1];
            }
        }
     
        return dp[nums.length-1];
    }
}

