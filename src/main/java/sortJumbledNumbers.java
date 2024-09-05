import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sortJumbledNumbers {
    public int[] sortJumbled(int[] mapping, int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            if(!map.containsKey(n)){
                map.put(n, translate(n, mapping));
            }
        }
        Integer[] res = new Integer[nums.length];
        for(int i = 0; i< nums.length; i++){
            res[i] = nums[i];
        }
        Arrays.sort(res, (a, b) -> Integer.compare(map.get(a), map.get(b)));
        for(int i = 0; i< res.length; i++){
            nums[i] = res[i];
        }
        return nums;
    }
    public int translate(int n, int[] mapping){
        char[] digits = Integer.toString(n).toCharArray();
        for(int i = 0; i< digits.length; i++){
            digits[i] = (char) ('0'+ mapping[digits[i] - '0']);
        }
        return Integer.parseInt(new String(digits));
    }
}
