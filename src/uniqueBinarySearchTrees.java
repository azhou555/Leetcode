public class uniqueBinarySearchTrees {
    public static int numTrees(int n){
        if(n <= 1){
            return n;
        } if(n > 2){
            return numTrees(n-2)+2*numTrees(n-1);
        } else {
            return 2 * numTrees(n - 1);
        }
    }
}
