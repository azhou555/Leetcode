public class reverseInteger {
    public int reverse(int x){
        boolean negative = x<0;
        if(negative){
            x = -x;
        }
        int sum = 0;
        while(x>0){
            if (sum >= (Math.pow(2, 31)-1)/10){
                return 0;
            }
            sum *= 10;
            int curr = x % 10;
            x = x/10;
            sum += curr;
        }
        if(negative){
            sum *= -1;
        }
        return sum;
    }
}
