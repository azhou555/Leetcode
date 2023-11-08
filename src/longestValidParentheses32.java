import java.util.Stack;

public class longestValidParentheses32 {
    public static int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int longest = 0;
        int curr = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty()) {
                if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                        curr += 2;
                        if (curr > longest) {
                            longest = curr;
                        }
                    } else {
                        stack.clear();
                        curr = 0;
                    }
                } else {
                    stack.push(c);
                }
            } else {
                if (c != ')')
                    stack.push(s.charAt(i));
            }
        }
        return longest;
    }
}
