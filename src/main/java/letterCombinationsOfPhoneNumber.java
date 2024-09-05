import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class letterCombinationsOfPhoneNumber {
    private static char[][] poss = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    public List<String> letterCombinations1(String digits){
        List<String> list = new ArrayList<>();
        int numLength = 1;
        for(int i = 0; i< digits.length(); i++){
            numLength *= poss[digits.charAt(i)-2].length;
        }
        for(int i = 0; i< numLength; i++){
            
        }
        return list;
    }
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone_map, output);
        return output;
    }

    private void backtrack(String combination, String next_digits, String[] phone_map, List<String> output) {
        if (next_digits.isEmpty()) {
            output.add(combination);
        } else {
            String letters = phone_map[next_digits.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
            }
        }
    }
}
