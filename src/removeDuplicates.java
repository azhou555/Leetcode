public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums, 2));
        for(int element: nums){
            System.out.print(element+", ");
        }
    }
    public static int removeElement(int[] nums, int val){
        int c = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val) {
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}
