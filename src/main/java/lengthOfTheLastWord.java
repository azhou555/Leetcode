public class lengthOfTheLastWord{
    public int lengthOfLastWord1(String s){
        int currLength = 0;
        boolean counting = false;
        for(int i = 0; i< s.length(); i++){
            if(counting){
                if(s.charAt(i) == ' '){
                    counting = false;
                } else{
                    currLength++;
                }
            } else{
                if(s.charAt(i) != ' '){
                    currLength = 1;
                    counting = true;
                }
            }
        }
        return currLength;
    }
    public int lengthOfLastWord(String s){
        int length = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(length != 0){
                    break;
                }
            } else{
                length++;
            }
        }
        return length;
    }
}