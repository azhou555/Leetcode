public class stockProfits {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit1(int[] nums){
        int max = 0;
        for(int i=0; i<nums.length;i++){
            for(int j=i; j<nums.length; j++){
                if(nums[j]-nums[i] > max){
                    max = nums[j]-nums[i];
                }
            }
        }
        return max;
    }
    public static int maxProfit(int[] nums){
        int max = 0;
        int low = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]-low>max){
                max = nums[i]-low;
            } else if(nums[i]<low){
                low = nums[i];
            }
        }
        return max;
    }
}
