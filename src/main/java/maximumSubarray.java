public class maximumSubarray {
    public static void main(String[] args) {
        int x = 4;
        int y = -7;
        int[] arr = {-2, 5, x, y, -3, 7};
        System.out.println(crossSum(arr, 0, (arr.length-1)/2, arr.length-1));
    }
    public static int maxSubArray(int[] nums) {
        int curr = 0, max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            max = Math.max(curr, max);
            if(curr < 0){
                curr = 0;
            }
            System.out.println(curr+", "+max+", "+nums[i]);
        }
        return max;
    }
    public static int crossSum(int[] arr, int left, int mid, int right) {
        // Include elements on the left of mid
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += arr[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        // Include elements on the right of mid
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += arr[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        // Return the maximum sum of the left subarray + right subarray
        return leftSum + rightSum;
    }

    // Function to find the maximum subarray sum using divide and conquer
    public static int maxSubArraySum(int[] arr, int left, int right) {
        // Base case: only one element
        if (left == right) {
            return arr[left];
        }

        // Find the midpoint
        int mid = (left + right) / 2;

        // Calculate the maximum subarray sum in the left half,
        // right half, and the middle subarray crossing the midpoint
        int leftSum = maxSubArraySum(arr, left, mid);
        int rightSum = maxSubArraySum(arr, mid + 1, right);
        int crossSum = crossSum(arr, left, mid, right);
        //System.out.print(leftSum+" ");
        System.out.println(crossSum+" "+left+" "+mid+" "+right);
        //System.out.print(rightSum+" ");
        // Return the maximum of the three sums
        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }
}
