public class lengthLastWord {
    public int lengthOfLastWord(String s){
        int i = s.length()-1;
        s=s.trim();
        while(i>=0){
            if(s.charAt(i) != ' '){
                return s.length()-i-1;
            }
        }
        return s.length();
    }
}
