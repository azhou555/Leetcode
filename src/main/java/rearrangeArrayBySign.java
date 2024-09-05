public class rearrangeArrayBySign {
    public int[] rearrangeArray1(int[] nums){
        int pos = 0;
        int neg = 0;
        int[] ans = new int[nums.length];
        boolean sign = true;
        for(int i = 0; i< ans.length; i++){
            if(sign){
                while(nums[pos] < 0){
                    pos++;
                }
                ans[i] = nums[pos];
                pos++;
            } else{
                while(nums[neg] > 0){
                    neg++;
                }
                ans[i] = nums[neg];
                neg++;
            }
            sign = !sign;
        }
        return ans;
    }
    public int[] rearrangeArray(int[] nums){
        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 0;
        for(int n: nums){
            if(n > 0){
                pos++;
                ans[2*pos-2] = n;
            } else{
                neg++;
                ans[2*neg-1] = n;
            }
        }
        return ans;
    }
}
