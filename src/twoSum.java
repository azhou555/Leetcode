import java.util.HashMap;
import java.util.Map;
class twoSum {
    public static void main(String[] args) {
        int[]nums = new int[]{5, 7, 8, 6, 4, 5};
        System.out.println(twoSum(nums, 9));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}