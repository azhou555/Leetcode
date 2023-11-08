public class sumConsecutiveNumbers {
    public static int consecutiveNumbersSum(int n){
        int tot = 0;;
        for(int i = 1; i*i<2*n; i++){
            if((n-i*(i-1)/2)%i == 0){
                tot++;
            }
        }
        return tot;
    }
}
