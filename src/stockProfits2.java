public class stockProfits2 {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] nums){
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
