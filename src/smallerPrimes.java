import java.util.*;
public class smallerPrimes {
    public static int countPrimes(int n){
        if(n == 0 || n == 1)
            return 0;
        boolean[] nums = new boolean[n];
        int count = 0;
        for(int i = 2; i< n; i+= 2){
            if(nums[i-1] == false){
                int k = i-1;
                while(k<n){
                    nums[k] = true;
                    k+= i;
                }
                count++;
            }
        }
        return count;
    }
}
