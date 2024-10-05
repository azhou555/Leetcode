public class binarySearch {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 10, 11, 20, 21};
        search(arr, 2);
        System.out.println(count);
    }
    public static int search(int arr[], int x)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            count++;
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

            // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }
}
