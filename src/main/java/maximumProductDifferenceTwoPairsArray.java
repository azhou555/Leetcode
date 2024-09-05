import java.util.Arrays;

public class maximumProductDifferenceTwoPairsArray {
    public int maxProductDifference1(int[] nums){
        Arrays.sort(nums);
        int product1 = nums[nums.length-1]*nums[nums.length-2];
        int product2 = nums[0]*nums[1];
        return product1-product2;
    }
    public int maxProductDifference(int[] nums){
        int max1 = 0;
        int max2 = 0;
        int min1 = 100000;
        int min2 = 100000;
        for(int x: nums){
            if(x > max2){
                max2 = x;
                if(max2 > max1){
                    int temp = max2;
                    max2 = max1;
                    max1 = temp;
                }
            } 
            if(x < min2){
                min2 = x;
                if(min2 < min1){
                    int temp = min2;
                    min2 = min1;
                    min1 = temp;
                }
            }
        }
        return max1*max2-min1*min2;
    }
}
