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
    public boolean isPalindrome(String s) {
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
}
