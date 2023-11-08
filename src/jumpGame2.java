import java.util.*;
public class jumpGame2 {

    public static int jump1(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums.length - i - 1 <= nums[i]) {
                dp[i] += 1;
            } else {
                int min = nums.length;
                for (int j = 1; j <= nums[i]; j++) {
                    if (dp[i + j] < min) {
                        min = dp[i + j];
                    }
                }
                dp[i] = min + 1;
            }
        }
        return dp[0];
    }
    public static int jump(int[] nums){
        int min = 0;
        int cand = 0;
        int jump = 0;
        for(int i = 0; i< nums.length-1; i++){
            cand = Math.max(cand, i+nums[i]);
            if (min == i){
                min = cand;
                jump++;
            }
        }
        return jump;
    }
    public static int jump2(int[] nums){
        int min = 0;
        int cand = 0;
        int jump = 0;
        int max = 0;
        for(int i = 0; i< nums.length; i++){
            if(min+nums[min] >= nums.length-1 && nums.length == 1) {
                return 0;
            } else if(min+nums[min] >= nums.length-1 && min == 0) {
                return 1;
            } else if(min+nums[min] >= nums.length-1){
                return jump;
            } else if( i <= nums[min]+min && min+nums[min] < nums[i]+i){
                if(cand+nums[cand] <= i+nums[i]){
                    cand = i;
                }
            } if (max == i){
                min = cand;
                max = cand+nums[cand];
                i =min;
                jump++;
            }
        }
        return jump;
    }
}
