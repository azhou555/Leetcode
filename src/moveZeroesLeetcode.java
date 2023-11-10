import java.util.Arrays;

public class moveZeroesLeetcode {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 13};
        moveZeroes(nums);
        //System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums){
        int holder;
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] == 0){
                if(nums[i+1] == 0){
                    int j = i+1;
                    while(j < nums.length-1 && nums[j] == 0){
                        j++;
                    }
                    holder = nums[i];
                    nums[i] = nums[j];
                    nums[j] = holder;
                }
                else {
                    holder = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = holder;
                }
            }
        }
    }
}
