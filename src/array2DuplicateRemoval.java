import java.util.*;
public class array2DuplicateRemoval {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 2, 3, 3, 3, 4, 4, 5, 6};
        System.out.println(removeDuplicates(nums));
        for(int element: nums){
            System.out.print(element+", ");
        }
    }
    public static int removeDuplicates(int[] nums){
        int j = 1;
        for(int i = 2; i<nums.length; i++){
            if(nums[i] != nums[j-1]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}
