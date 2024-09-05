public class findPivotInteger {
    public int pivotInteger(int n){
        int sum = n*(n+1)/2;
        System.out.println(sum);
        for(int i = n; i>= 0; i--){
            if(2*sum== i+n*(n+1)/2){
                return i;
            }
            sum -= i;
        }
        return -1;
    }
}
