public class printArray {
    public static void print(Object[] array){
        System.out.print("[");
        for(int i = 0; i< array.length-1; i++){
            System.out.print(array[i]+", ");
        }
        System.out.print(array[array.length-1]);
        System.out.print("]");
    }
    public static void intPrint(int[] array){
        System.out.print("[");
        for(int i = 0; i< array.length-1; i++){
            System.out.print(array[i]+", ");
        }
        System.out.print(array[array.length-1]);
        System.out.print("]");
    }
}
