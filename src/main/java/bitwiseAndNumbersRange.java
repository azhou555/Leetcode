public class bitwiseAndNumbersRange {
    public static int rangeBitwiseAnd(int left, int right){
        int total = left;
        System.out.println(left & right);
        for(int i = left+1; i< right; i++){
            total = total & i;
            if(total == 0){
                return total;
            }
        }
        return total & right;
    }
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(2147483647, 2147483647));
    }
}
