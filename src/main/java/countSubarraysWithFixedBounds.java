public class countSubarraysWithFixedBounds {
    public long countSubarrays(int[] nums, int minK, int maxK){
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] >= minK && nums[i] <= maxK){
                count++;
            }
        }
        return (long) Math.pow(2, count-2);
    }
}
