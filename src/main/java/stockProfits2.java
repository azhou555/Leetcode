public class stockProfits2 {
    public int maxProfit(int[] nums){
        int tot = 0;
        int low = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]-low>0){
                tot += nums[i]-low;
                low = nums[i];
            } else if(nums[i]<low){
                low = nums[i];
            }
        }
        return tot;
    }
}
