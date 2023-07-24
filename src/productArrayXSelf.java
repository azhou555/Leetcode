public class productArrayXSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        nums = productExceptSelf(nums);
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] sols = new int[nums.length];
        int left = 1, right = 1;
        for (int i = 0; i < nums.length; i++){
            sols[i] = left;
            left *= nums[i];
        }
        for(int i = nums.length-1; i>= 0; i--){
            sols[i]*= right;
            right *= nums[i];
        }
        return sols;
    }
}
