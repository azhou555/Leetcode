import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class majorityElementII {
    public List<Integer> majorityElement(int[] nums){
        int limit = nums.length/3;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int x: nums){
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            } else{
                map.put(x, 1);
            }
            if(map.get(x) > limit){
                if(!result.contains(x)){
                    result.add(x);
                }
                if(result.size() > 1){
                    return result;
                }
            }
        }
        return result;
    }
}
