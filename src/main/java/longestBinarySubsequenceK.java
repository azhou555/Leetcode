public class longestBinarySubsequenceK {
    public int longestSubsequence(String s, int k){
        int l = 0;
        int r = 0;
        int longest = 0;
        int concurrent = 0;
        while(r < s.length()){
            int i = Integer.parseInt(String.valueOf(s.charAt(r)));
            if(concurrent*2+i <=k){
                concurrent *= 2;
                concurrent += i;
                if(r-l+1 > longest){
                    longest = r-l+1;
                }
            } else{
                while(concurrent*2+i > k && l < r){
                    concurrent -= (int) Math.pow(2, Integer.parseInt(String.valueOf(s.charAt(l)))*(r-l-1));
                    l++;
                }
                concurrent += i;
            }
            r++;
        }
        return longest;
    }
}
