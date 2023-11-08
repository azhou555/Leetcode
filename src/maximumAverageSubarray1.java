public class maximumAverageSubarray1 {
    public static double findMaxAverage(int[] nums, int k){
        int curr = 0;
        for(int i = 0; i < k; i++){
            curr += nums[i];
        }
        double max = curr;
        for(int i = 1; i< nums.length-k+1; i++){
            curr += nums[i+k-1]-nums[i-1];
            if(curr > max){
                max = curr;
            }
        }
        return max/k;
    }
}
