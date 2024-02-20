public class longestSubarrayOfOneAfterDeletingOne {
    public int longestSubarray(int[] nums){
        int left = 0;
        int right = 0;
        int max = 0;
        int lastZero = -1;
        while(right < nums.length){
            if(nums[right] == 0){
                left = lastZero+1;
                lastZero = right;
            }
            max = Math.max(max, right-left);
            right++;
        }
        return max;
    }
}
