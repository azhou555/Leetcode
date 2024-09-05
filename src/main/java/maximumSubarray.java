public class maximumSubarray {
    public int maxSubArray(int[] nums) {
        int curr = 0, max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            max = Math.max(curr, max);
            if(curr < 0){
                curr = 0;
            }
        }
        return max;
    }
}
