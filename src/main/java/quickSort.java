public class quickSort {
    static int count1;
    static int count2;
    static int count3;
    public static void main(String[] args) {
        count1 = 0;
        count2 = 0;
        count3 = 0;
        int n = 37;
        int[] array = new int[n];
        for(int i = 0; i< n; i++){
            array[i] = i;
        }
        sort(array, 0,n-1);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(n*(n-1)/2);
    }
    public static int[] sort(int[] array, int start, int end){
        if(start < end){
            count1++;
            int index = partition(array, start, end);
            sort(array, start, index-1);
            sort(array, index+1, end);
        }
        return array;
    }
    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int t = start;
        for(int i = start; i< end; i++){
            count2++;
            if(array[i] <= pivot){
                count3++;
                int temp = array[i];
                array[i] = array[t];
                array[t] = temp;
                t++;
            }
        }
        int temp = array[t];
        array[t] = pivot;
        array[end] = temp;
        return t;
    }
}
