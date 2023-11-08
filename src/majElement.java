import java.util.*;
public class majElement {
    public static int majorityElement(int[] nums){
        int c = 0;
        int d = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int element: nums){
            if(map.containsKey(element)){
                map.put(element, map.get(element)+1);
            } else{
                map.put(element, 1);
            } if(map.get(element) > d){
                c = element;
                d = map.get(element);
            }
        } return c;
    }
    public static int majorityElement2(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
