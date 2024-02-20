import java.util.Map;
import java.util.HashMap;

public class delAndEarn {
    public int deleteAndEarn(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+i);
            } else{
                map.put(i, i);
            }
        }
        return 0;
    }
}
