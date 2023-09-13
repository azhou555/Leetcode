public class maxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(longestOnes(nums, 2));
    }
    public static int longestOnes1(int[] nums, int k){
        int max = 0;
        for(int i = 0; i< nums.length; i++){
            if(i == 0 || nums[i] == 0){
                int x = recursion(nums, k, i, 0);
                if(x > max){
                    max = x;
                }
            }
        }
        return max;
    }
    public static int recursion(int[] nums, int k, int index, int tot){
        if(index >= nums.length){
            return 0;
        }
        if(nums[index] == 1){
            return 1+recursion(nums, k, index+1, tot+1);
        } else{
            if(k>0) {
                return 1 + recursion(nums, k - 1, index + 1, tot + 1);
            } else{
                return 0;
            }
        }
    }
    public static int longestOnes2(int[] nums, int k){
        int zeroCount = 0;
        int max = 0;
        int left = 0;
        for(int right = 0; right< nums.length; right++){
            if(nums[right] == 1){
                max = Math.max(max, right-left+1);
            }else{
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
        }
        return max;
    }
    public static int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int zeros=0;

        while(end<nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            end++;
            if(zeros>k){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }
        }
        return end-start;
    }
}
