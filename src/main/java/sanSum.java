import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class sanSum {
    public List<List<Integer>> threeSum1(int[] nums){
        List<List<Integer>> compileList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            List<List<Integer>> returnedList = twoSum(nums, -nums[i], i);
            for(List<Integer> list: returnedList){
                list.add(nums[i]);
                compileList.add(list);
            }
            
        }
        return compileList;
    }
    public List<List<Integer>> twoSum(int[] nums, int target, int ignoreIndex) {
        Set<Integer> seen = new HashSet<>();
        List<List<Integer>> retList = new ArrayList<>();
        if(nums.length-ignoreIndex < 2){
            return retList;
        }
        for(int i = ignoreIndex+1; i< nums.length; i++){
            if(seen.contains(target-nums[i])){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(target-nums[i]);
                retList.add(list);
            }
            seen.add(nums[i]);
        }
        return retList;
    }
    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> retList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        retList.addAll(set);
        return retList;
    }
    private static List<List<Integer>> retList;
    public List<List<Integer>> threeSum(int[] nums) {
        retList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i-1] != nums[i]) {
                twoSum(-nums[i], nums, i + 1, nums.length - 1);
            }
        }

        return retList;
    }
    private void twoSum(int target, int[] nums, int i, int j) {
        while(i < j) {
            int sum = nums[i] + nums[j];
            
            if(sum < target) {
                i++;
                continue;
            }

            if(sum > target) {
                j--;
                continue;
            }

            retList.add(Arrays.asList(target * -1, nums[i], nums[j]));

            i++; j--;

            while(i < j && nums[j] == nums[j + 1]) j--;
        }
    }
}
