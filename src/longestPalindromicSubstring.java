public class longestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aba"));
    }
    public static String longestPalindrome(String s){
        int start = 0;
        int end = 0;
        for(int i = 0; i< s.length(); i++){
            char curr = s.charAt(i);
            int left = i;
            int right = i;
            while(left >= 0 && s.charAt(left) == curr)
                left--;
            while(right<s.length() && s.charAt(right) == curr)
                right++;
            while(left >= 0 && right < s.length()){
                if(s.charAt(left) != s.charAt(right))
                    break;
                left--;
                right++;
            }
            left++;
            if(end-start < right-left){
                start= left;
                end = right;
            }
        }
        return s.substring(start, end);
    }

    public static String longestPalindrome2(String s) {
        int longest = 1;
        if (s.length() == 1) {
            return s;
        }
        int start = 0;
        int end = 0;
        int i = 0;
        int mark = 0;
        while (i < s.length() - longest / 2) {
            while (start >= 0 && end <= s.length() - 1) {
                if (start == end){
                    while((start> 0 && s.charAt(start-1) == s.charAt(start)) || (end < s.length()-1 && s.charAt(start) == s.charAt(end+1))){
                        if(start > 0 && s.charAt(start-1) == s.charAt(start)){
                            start--;
                        } else{
                            end++;
                        }
                        if (end - start + 1 > longest) {
                            longest = end - start + 1;
                            mark = start;
                        }
                    }
                }
                if (start > 0 && end < s.length() - 1 && s.charAt(start - 1) == s.charAt(end + 1)) {
                    start--;
                    end++;
                    if (end - start + 1 > longest) {
                        longest = end - start + 1;
                        mark = start;
                    }
                } else{
                    break;
                }
            }
            i++;
            start = i;
            end = i;
        }
        return s.substring(mark, mark + longest);
    }

    public static String longestPalindrome1(String s) {
        int longest = 0;
        int i = 0;
        int mark = 0;
        while (i < s.length()) {
            for (int k = i + longest; k < s.length(); k++) {
                if (isPalindrome(s.substring(i, k + 1)) && k - i + 1 > longest) {
                    mark = i;
                    longest = k - i + 1;
                }
            }
            i++;
        }
        return s.substring(mark, mark + longest);
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
