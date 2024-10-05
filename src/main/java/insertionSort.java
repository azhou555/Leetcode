public class insertionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 0, 1};
        sort(array);
    }
    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            int count = 0;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = key;
            System.out.println(count);
        }
    }

}
