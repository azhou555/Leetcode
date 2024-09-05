import java.util.HashSet;
public class findSingleNumber {
    public int singleNumber1(int[] nums){
        int sum = 0;
        HashSet<Integer> seen = new HashSet<>();
        for(int x: nums){
            sum += x;
            if(!seen.contains(x)){
                seen.add(x);
            } else{
                seen.remove(x);
                sum -= 2*x;
            }
        }
        return sum;
    }
    public int singleNumber(int[] nums){
        int ret = 0;
        for(int x: nums){
            ret ^= x;
        }
        return ret;
    }
}
