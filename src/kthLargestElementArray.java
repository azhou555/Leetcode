import java.util.PriorityQueue;

public class kthLargestElementArray {

    public static int findKthLargest(int[] nums, int k) {
        int[] array = new int[20002];
        for (int i = 0; i < nums.length; i++) {
            array[nums[i]+10001]++;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            k -= array[i];
            if (k <= 0) {
                return i-10001;
            }
        }
        return -1;
    }
    public static int findKthLargest1(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        return minHeap.peek();
    }
}
