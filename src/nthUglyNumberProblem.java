public class nthUglyNumberProblem {
    public static void main(String[] args) {

    }
    public static int nthUglyNumber(int n){
        int count = 0;
        for(int i = 1; i< Integer.MAX_VALUE; i++){
            if(isUgly(i)){
                count++;
                if(count == n)
                    return i;
            }
        }
        return -1;
    }
    public static boolean isUgly(int n){
        if(n == 1)
            return true;
        if(n <= 0)
            return false;
        return n % 2 == 0 ? isUgly(n/2): n%3 == 0 ? isUgly(n/3): n%5 == 0 ? isUgly(n/5):false;
    }
}
