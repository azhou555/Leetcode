public class firstPalindromicStringInArray {
    public String firstPalindrome(String[] words){
        for(String elem: words){
            if(isPalindrome(elem)){
                return elem;
            }
        }
        return "";
    }
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(j > i){
            char f = s.charAt(i);
            char l = s.charAt(j);
            if(f != l) return false;
            i++;
            j--;
        }
        return true;
    }
}
