import java.util.ArrayList;
import java.util.List;

public class findSubsets {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums){
        result = new ArrayList<>();
        subsetHelper(nums, 0, new ArrayList<>());
        return result;
    }
    public void subsetHelper(int[] nums, int i, List<Integer> path){
        result.add(new ArrayList<>(path));
        for(int j = i; j < nums.length; j++){
            path.add(nums[j]);
            subsetHelper(nums, j+1, path);
            path.remove(path.size()-1);
        }
    }
}
