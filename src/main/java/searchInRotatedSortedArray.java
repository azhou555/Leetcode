public class searchInRotatedSortedArray {
    public int search(int[] array, int target) {
        return helper(array, target, 0, array.length-1);
    }
    public int helper(int[] array, int target, int left, int right){
        int median = (left+right)/2;
        int medianVal = array[median];

        if(medianVal == target){
            return median;
        } else if(medianVal > target){
            return helper(array, target, left, median);
        } else{
            return helper(array, target, median, right);
        }
    }
}
