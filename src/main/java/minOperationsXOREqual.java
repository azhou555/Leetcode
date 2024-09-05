public class minOperationsXOREqual {
    public int minOperations(int[] nums, int k){
        int result = 0;
        for(int n: nums){
            result = result ^ n;
        }
        int count = 0;
        while (k > 0 || result > 0) {
            if ((k % 2) != (result % 2)) {
                count++;
            }
            k /= 2;
            result /= 2;
        }
        return count;
    }
}
