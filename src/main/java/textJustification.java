import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class textJustification {
    public List<String> fullJustify(String[] words, int maxWidth){
        List<String> res = new ArrayList<>();
        int currWidth = 0;
        List<String> currWords = new LinkedList<>();
        //StringBuilder sb = new StringBuilder();
        for(int i = 0; i< words.length; i++){
            if (words[i].length()+1+currWidth < maxWidth){
                currWidth += words[i].length()+1;
                currWords.add(words[i]);
            }
        }
        return res;
    }
}
