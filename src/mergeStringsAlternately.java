public class mergeStringsAlternately {
    public static String mergeAlternately1(String word1, String word2){
        int l1 = word1.length();
        int l2 = word2.length();
        StringBuilder ans = new StringBuilder("");
        int i = 0, j = 0;
        while(i< l1 || j<l2){
            if ((i + j) % 2 == 0) {
                if(i<l1) {
                    ans.append(word1.charAt(i));
                }
                i++;
            } else{
                if(j<l2) {
                    ans.append(word2.charAt(j));
                }
                j++;
            }
        }
        return ans.toString();
    }
    public static String mergeAlternately(String word1, String word2) {
        int l = 0;
        int r = 0;
        int c = 0;
        char[] ans = new char[word1.length()+word2.length()];
        while (l < word1.length() && r < word2.length()) {
            ans[c] = word1.charAt(l);
            c++;
            ans[c] = word2.charAt(r);
            c++;
            l++;
            r++;
        }
        while (l < word1.length()) {
            ans[c] = word1.charAt(l);
            c++;
            l++;
        }
        while (r < word2.length()) {
            ans[c] = word2.charAt(r);
            c++;
            r++;
        }
        return String.valueOf(ans);
    }
}
