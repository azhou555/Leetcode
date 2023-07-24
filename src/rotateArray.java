import java.util.*;
public class rotateArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        rotate(nums, 2);
        for(int element: nums){
            System.out.print(element+", ");
        }
    }
    public static int[] rotate(int[] nums, int k){
        k%=nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        return nums;
    }
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
