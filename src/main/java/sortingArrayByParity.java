public class sortingArrayByParity {
    public int[] sortArrayByParity1(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            if(nums[i] %2 != 0){
                int j = i;
                while(j< nums.length-1 && nums[j]%2 != 0){
                    j++;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex++;
            } else {
                result[oddIndex] = num;
                oddIndex--;
            }
        }

        return result;
    }
}
