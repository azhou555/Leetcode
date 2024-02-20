import java.util.*;
public class jumpGame {
    public boolean canJump(int[] nums){
        int max = 0;
        for(int i = 0; i< nums.length; i++){
            if (i> max){
                return false;
            }
            else if(nums[i]+i> max){
                max = nums[i]+i;
            }
        }
        return true;
    }
    public boolean canJump1(int[] nums){
        boolean[] dp = new boolean[nums.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        while(!queue.isEmpty()){
            int y = queue.poll();
            int x = nums[y];
            for(int i=0; i<= x; i++){
                if(y+i<nums.length) {
                    dp[y + i] = true;
                    if(i>0) {
                        queue.offer(y + i);
                    }
                }
            }
        }
        return dp[nums.length-1];
    }
}
