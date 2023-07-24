public class isUglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(8));
    }
    public static boolean isUgly(int n){
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
}
