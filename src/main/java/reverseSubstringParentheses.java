public class reverseSubstringParentheses {
    public String reverseParentheses(String s){
        char[] charArr = s.toCharArray();
        int l = 0;
        for(int r = 0; r < charArr.length; r++){
            if(charArr[r] == ')'){
                l = r;
                while(charArr[l] != '('){
                    l--;
                }
                reverseSubstring(l, r, charArr);
                charArr[l] = ' ';
                charArr[r] = ' ';
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char c: charArr){
            if(c != ' '){
                ans.append(c);
            }
        }
        return ans.toString();
    }
    public char[] reverseSubstring(int l, int r, char[] s){
        char temp = ' ';
        for(int i = 0; i< (r-l+1)/2; i++){
            temp = s[r-i];
            s[r-i] = s[l+i];
            s[l+i] = temp;
        }
        return s;
    }
}
