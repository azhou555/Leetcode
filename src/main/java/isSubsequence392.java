public class isSubsequence392 {
    public boolean isSubsequence(String s, String t){
        int i = 0;
        int j = 0;
        int l = s.length();
        int k = t.length();
        while(j<k && i< l){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == l;
    }
}
