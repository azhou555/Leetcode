public class increasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n <= max1)
                max1 = n;
            else if(n <= max2)
                max2 = n;
            else
                return true;
        }
        return false;
    }
    public boolean increasingTriplet1(int[] nums){
        if(nums.length < 3){
            return false;
        }
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] < x){
                x = nums[i];
                y = nums[i];
            } else if(nums[i] < y){
                y = nums[i];
            }else{
                if(x == y) {
                    y = nums[i];
                } else{
                    return true;
                }
            }
        }
        return false;
    }
    public boolean increasingTriplet2(int[] nums){
        if(nums.length < 3)
            return false;
        int l = 0;
        int r = nums.length-1;
        int lMin = nums[l];
        int rMax = nums[r];
        while(l<r){
            if((nums[r] < rMax && nums[r] > lMin) || (nums[l] > lMin && nums[l] < rMax)) {
                return true;
            } if(nums[l] < lMin){
                lMin = nums[l];
            } if(nums[r] > rMax){
                rMax = nums[r];
            } if(nums[l] > rMax){
                l++;
            } else{
                r--;
            }
        }
        return false;
    }
}
