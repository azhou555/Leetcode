public class smallestMissingPositive {
    public int firstMissingPositive1(int[] nums){
        for(int i = 0; i< nums.length; i++){
            if(nums[i] > nums.length || nums[i] <= 0){
                nums[i] = -1;
            } else{
                nums[Math.abs(nums[i])] *= -1;
            }
        }
        for(int i = 0; i< nums.length; i++){
            if(nums[i] >= 0){
                return i;
            }
        }
        return nums.length+1;
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(nums[i] < 0) nums[i] = 0;
        }
        for(int i=0;i<n;i++) {
            int j = Math.abs(nums[i]) - 1;
            if(j < 0 || j >= nums.length) continue;
            if(nums[j] > 0) {
                nums[j] *= -1;
            } else if(nums[j] == 0) {
                nums[j] = Integer.MIN_VALUE + 1; 
            }
        }
        for(int i=0;i<n;i++) {
            if(nums[i] >= 0) return i+1;
        }
        return n+1;
    }
}
