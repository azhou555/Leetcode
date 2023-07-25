public class isUglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(7));
    }
    public static boolean isUgly1(int n){
        if(n == 0 || n == 1)
            return true;
        boolean[] nums = new boolean[n];
        for(int i = 2; i< n; i++){
            if(nums[i-1] == false){
                if(i != 2 && i != 3 && i!= 5 && n%i == 0) {
                    return false;
                }
                int k = i-1;
                while(k<n){
                    nums[k] = true;
                    k+= i;
                }
            }
        }
        return true;
    }
    public static boolean isUgly(int n){
        if(n == 1)
            return true;
        if(n <= 0)
            return false;
        return n % 2 == 0 ? isUgly(n/2): n%3 == 0 ? isUgly(n/3): n%5 == 0 ? isUgly(n/5):false;
    }
}
