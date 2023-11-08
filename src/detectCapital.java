import static java.lang.Character.isUpperCase;

public class detectCapital {
    public static boolean detectCapitalUse(String word){
        if(word.length() == 1)
            return true;
        boolean capital;
        capital = isUpperCase(word.charAt(0));
        if(capital && !isUpperCase(word.charAt(1))){
            capital = false;
        }
        for(int i = 1; i< word.length(); i++){
            if(!capital && isUpperCase(word.charAt(i))){
                return false;
            } else if(capital && !isUpperCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
