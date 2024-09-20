import java.util.HashSet;

public class uncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2){
        String[] a1 = s1.split(" ");
        String[] a2 = s2.split(" ");
        HashSet<String> set = new HashSet<>();
        HashSet<String> seen = new HashSet<>();
        for(String s: a1){
            if(seen.contains(s)){
                continue;
            }
            else if (set.contains(s)){
                set.remove(s);
                seen.add(s);
            } else{
                set.add(s);
            }
        }
        for(String s: a2){
            if(seen.contains(s)){
                continue;
            }
            else if (set.contains(s)){
                set.remove(s);
                seen.add(s);
            } else{
                set.add(s);
            }
        }
        String[] res = new String[set.size()];
        int count = 0;
        for(String s: set){
            res[count++] = s;
        }
        return res;
    }
}
