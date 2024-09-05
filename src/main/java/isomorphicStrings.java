import java.util.HashSet;
public class isomorphicStrings {
    public boolean isIsomorphic(String s, String t){
        char[] ascii = new char[26];
        if(s.length() != t.length()){
            return false;
        }
        HashSet<Character> used = new HashSet<>();
        for(int i = 0; i< s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(ascii[sc-97] != 0){
                if(tc != ascii[sc-97]){
                    return false;
                }
            } else{
                if(used.contains(tc)){
                    return false;
                }
                ascii[sc-97] = tc;
                used.add(tc);
            }
        }
        return true;
    }
}
