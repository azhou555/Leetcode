import java.util.List;
import java.util.ArrayList;

public class wordBreakDictionary {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pen");
        System.out.println(wordBreak1("apple", list));
    }
    public static boolean wordBreak1(String s, List<String> wordDict){
        if(s.length() == 0){
            return true;
        }
        for(int i = 0; i<= s.length(); i++){
            if(wordDict.contains(s.substring(0, i))){
                if (wordBreak1(s.substring(i), wordDict)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean wordBreak(String s, List<String> wordDict){
        return false;
    }
}
