public class kthFactorInteger {
    public static void main(String[] args) {

    }
    public static int kthFactor(int n, int k){
        int c = 0;
        for(int i = 0; i< n/2; i++){
            if(n% i == 0){
                c++;
                if(c == k){
                    return i;
                }
            }
        }
        return c == k-1 ? n : -1;
    }
}
