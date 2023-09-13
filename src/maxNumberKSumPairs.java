import java.util.Arrays;
import java.util.HashMap;

public class maxNumberKSumPairs {
    public static void main(String[] args) {

    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0,right = nums.length-1,count=0;
        while(left<right) {
            int sum = nums[left] + nums[right];

            if(sum == k) {
                left++;
                right--;
                count++;
            }else if(sum>k) {
                right--;
            }else {
                left++;
            }
        }
        return count;
    }
    public static int maxOperations1(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i: nums){
            int x = k-i;
            if(map.containsKey(x)){
                count++;
                if(map.get(x) > 1){
                    map.put(x, map.get(x)-1);
                } else{
                    map.remove(x);
                }
            } else if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            } else{
                map.put(i, 1);
            }
        }
        return count;
    }
    public static int maxOperations2(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i: nums){
            int x = k-i;
            if(map.containsKey(x)){
                count++;
                if(map.get(x) > 1){
                    map.put(x, map.get(x)-1);
                } else{
                    map.remove(x);
                }
            } else{
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }
        return count;
    }
}
