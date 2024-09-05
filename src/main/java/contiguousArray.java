import java.util.HashMap;
import java.util.Map;

public class contiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int sub = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sum == 0) {
                sub = i + 1;
            } else if (map.containsKey(sum)) {
                sub = Math.max(sub, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return sub;
    }
}
