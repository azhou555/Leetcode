public class bubblesort {
    public static void main(String[] args) {
        for(int i = 0; i< 500; i+= 2){
            if((i)*(i+2)/8 != bubble(fill(i))) System.out.println(false);
        }
    }
    public static int bubble(int[] arr){
        int n = arr.length;
        int counter = 0;
        boolean swapped;
        for(int i = 0; i< n-1; i++){
            swapped = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    counter++;
                    swapped = true;
                }
            }
            if(!swapped){
                return counter;
            }
        }
        return counter;
    }
    public static int[] fill(int n){
        int[] array = new int[n];
        for(int i = 0; i< n; i++){
            if(i % 2 == 0){
                array[i] = 2*i;
            } else{
                array[i] = -2*(n-i);
            }
        }
        return array;
    }
}
