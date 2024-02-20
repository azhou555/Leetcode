import java.util.ArrayList;
import java.util.List;

public class printWordsVertically {
    @SuppressWarnings("unused")
    public List<String> printVertically(String s){
        List<String> ans = new ArrayList<String>();
        int length = 0;
        int thisWord = 0;
        boolean firstWord = true;
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == ' '){
                firstWord = false;
                thisWord = i+1;
            } else{
                if(firstWord){
                    StringBuilder sb = new StringBuilder(s.charAt(i));
                    ans.add(String.valueOf(s.charAt(i)));
                }
                length++;
            }
        }
        return ans;
    }
}
