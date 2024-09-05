import java.util.HashMap;

public class customSortingString {
    public String customSortString(String order, String s){
        HashMap<Character, Integer> included = new HashMap<>();
        char[] sArray = s.toCharArray();
        for(char c: sArray){
            if(included.containsKey(c)){
                included.put(c, included.get(c)+1);
            } else{
                included.put(c, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        char[] orderArray = order.toCharArray();
        for(char c: orderArray){
            if(included.containsKey(c)){
                for(int i = 0; i< included.get(c); i++){
                    sb.append(c);
                }
                included.remove(c);
            }
        }
        for(char c: included.keySet()){
            for(int i = 0; i< included.get(c); i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
