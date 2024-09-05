public class findTheDuplicateNumber {
    public int findDuplicate(int[] nums){
        int[] check = new int[100001];
        for(int x: nums){
            if(check[x] != 0){
                return x;
            } else{
                check[x] = check[x]+1;
            }
        }
        return 0;
    }
}
