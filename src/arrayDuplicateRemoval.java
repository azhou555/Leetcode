import java.util.*;

public class arrayDuplicateRemoval {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 2, 3, 3, 3, 4, 4, 5, 6};
        System.out.println(removeDuplicates(nums));
        for(int element: nums){
            System.out.print(element+", ");
        }
    }
    public static int removeDuplicates(int[] nums){
        int j = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
