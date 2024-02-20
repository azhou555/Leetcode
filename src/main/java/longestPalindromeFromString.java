import java.util.HashSet;

public class longestPalindromeFromString {
    public int longestPalindrome(String s){
        HashSet<Character> hash = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (hash.contains(c)) {
                hash.remove(c);
                count += 2;
            } else {
                hash.add(c);
            }
        }
        return count >=  s.length() ? count : count+1;
    }
}
