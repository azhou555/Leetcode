import java.util.HashMap;
import java.util.Map;
public class minNumStepsMakeStringsAnagram {
    public int minSteps1(String s, String t) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int count=0;
        for(int i = 0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch) && map.get(ch) > 0){
                map.put(ch, map.get(ch) - 1);
            }
            else{
                count++;
            }
        }
        return count;
        
    }
    public int minSteps(String s, String t) {
        int arr[] = new int[26];

       for(char c : s.toCharArray()) {
           arr[c - 'a']--;
       }

       for(char c : t.toCharArray()) {

           arr[c - 'a']++;
       }

       int count = 0;
       for(int i = 0; i < 26; i++) {
           if(arr[i] > 0) {
               count += arr[i];
           }
       }

       return count;
   }
}
