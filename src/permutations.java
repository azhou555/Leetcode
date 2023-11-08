import java.util.*;

public class permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        permuteHelper(res, new ArrayList<>(), visited, nums);
        return res;
    }

    public static void permuteHelper(List<List<Integer>> list, List<Integer> helper, boolean[] visited, int[] nums) {
        if(helper.size() == nums.length)
            list.add(new ArrayList<>(helper));
         else{
             for(int i = 0; i< nums.length; i++){
                 if(!visited[i]) {
                     visited[i] = true;
                     helper.add(nums[i]);
                     permuteHelper(list, helper, visited, nums);
                     helper.remove(helper.size() - 1);
                     visited[i] = false;
                 }
            }
        }
    }
}
