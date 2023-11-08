public class largestNumberString {
    public static String largestNumber(int[] nums){
        String res = "";
        int holder = 0;
        boolean[] visited = new boolean[nums.length];
        for(int i = 0; i< nums.length; i++){
            double max = 0;
            for(int j = 0; j< nums.length; j++){
                if(visited[j] == false && (double) nums[j]/Math.pow(10, String.valueOf(nums[j]).length()) > max){
                    holder = j;
                    max = (double) nums[j]/Math.pow(10, String.valueOf(nums[j]).length());
                }
            }
            visited[holder] = true;
            res = res+nums[holder];
        }
        return res;
    }
}
