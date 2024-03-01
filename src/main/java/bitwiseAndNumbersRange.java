public class bitwiseAndNumbersRange {
    public static int rangeBitwiseAnd1(int left, int right){
        int total = left;
        for(int i = total<2147483647 ? left+1: left; i< right; i++){
            total = total & i;
            if(total == 0){
                return total;
            }
        }
        return total & right;
    }
    public int rangeBitwiseAnd2(int left, int right){
        int res = left & right;
        if(left == right){
            return res;
        }
        int shift = (int) Math.pow(2, findSignificantBit(res)+1)-1;
        shift = ~shift;
        return res | shift;
    }
    public int findSignificantBit(int num){
        int i = 0;
        while(Math.pow(2, i) < num){
            i++;
        }
        return i;
    }
    public int rangeBitwiseAnd(int left, int right){
        int count= 0;
        while(left != right){
            left >>= 1;
            right >>= 1;
            count++;
        }
        return left << count;
    }
}
