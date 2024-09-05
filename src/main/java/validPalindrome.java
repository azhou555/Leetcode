public class validPalindrome {
    public boolean isPalindrome1(String s){
        char[] charArray = s.toCharArray();
        if(charArray.length == 0) return true;
        int left = 0;
        int right = charArray.length-1;
        while(left<=right){
            if(!Character.isLetterOrDigit(charArray[left])) left++;
            else if(!Character.isLetterOrDigit(charArray[right])) right--;
            else{
               if (Character.toLowerCase(charArray[left]) != Character.toLowerCase(charArray[right]))
                    return false;
                left++;
                right--;
            }
        }
        return true;
    }
    public boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(j > i){
            char f = s.charAt(i);
            char l = s.charAt(j);
            if(!((f >= 'A' && f <= 'Z') || (f >= 'a' && f <= 'z') ||(f >= '0' && f <= '9'))){
                i++;
                continue;
            }
            if(!((l >= 'A' && l <= 'Z') || (l >= 'a' && l <= 'z') || (l >= '0' && l <= '9'))){
                j--;
                continue;
            }
            if (f >= 'A' && f <= 'Z') {
                f = (char)(f - 'A' + 'a');
            }
            if (l >= 'A' && l <= 'Z') {
                l = (char)(l - 'A' + 'a');
            }
            if(f != l) return false;
            i++;
            j--;
        }
        return true;
    }
}
