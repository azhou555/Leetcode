public class implementedPow {
    public double myPow(double x, int n){
        long i = n;
        double ans = 1.0;
        if(i<0){
            x = 1/x;
            i *= -1;
        } while(i != 0){
            if(i%2 == 1){
                ans *= x;
                i--;
            } else{
                x *= x;
                i /= 2;
            }
        }
        return ans;
    }
    public double myPow1(double x, int n){
        return Math.pow(x, n);
    }
    public double myPow2(double x, int n){
        long i = n;
        double ans = solve(x, Math.abs(i));
        return i<0 ? 1/ans: ans;
    }
    public double solve(double x, long n){
        if(n == 0){
            return 1;
        }
        double temp = solve(x, n/2);
        temp = temp*temp;
        if(n%2 == 0){
            return temp;
        } else{
            return temp*x;
        }
    }
}
