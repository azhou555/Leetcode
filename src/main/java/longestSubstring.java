import java.util.*;

public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }

        return maxLength;
    }
    public int lengthOfLongestSubstring1(String s) {
        int longest = 0;
        int count = 0;
        Map<String, Integer> set = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            if(set.containsKey(s.substring(i,i+1))){
                count = i-set.get(s.substring(i,i+1));
                set.remove(s.substring(i,i+1));
                set.put(s.substring(i,i+1),i);
            }
            else{
                set.put(s.substring(i,i+1),i);
                count++;
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }
    public int lengthOfLongestSubstring2(String s){
        int longest = 0;
        int back = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            if(!map.containsKey(s.charAt(i)) || map.get(s.charAt(i)) < back){
                map.put(s.charAt(i), i);
                longest = Math.max(longest, i-back+1);
            } else{
                back = map.get(s.charAt(i))+1;
                map.put(s.charAt(i), i);
            }
        }
        return longest;
    }
}
