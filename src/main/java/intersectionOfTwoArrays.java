import java.util.ArrayList;

public class intersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] countArray = new int[1001];
        ArrayList<Integer> resList = new ArrayList<Integer>();
        for(int num1 : nums1){
            countArray[num1] = 1;
        }
        for(int num2: nums2){
            if(countArray[num2] == 1){
                countArray[num2] = 2;
            }
        }
        for(int i = 0; i < countArray.length; i++){
            if(countArray[i] == 2){
                resList.add(i);
            }
        }
        int[] res = new int[resList.size()];
        for(int i = 0; i < resList.size(); i++){
            res[i] = resList.get(i);
        }

        return res;
    }
}
