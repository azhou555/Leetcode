import java.util.Stack;

public class longestValidParentheses32 {
    public int longestValidParentheses1(String s) {
        Stack<Character> stack = new Stack<>();
        int longest = 0;
        int curr = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty()) {
                if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                        count += 2;
                    } else {
                        stack.clear();
                        longest = Math.max(longest, curr);
                        curr = 0;
                        count = 0;
                    }
                } else {
                    stack.push(c);
                }
            } else {
                curr += count;
                count = 0;
                longest = Math.max(longest, curr);
                if(c == '('){
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.isEmpty()){
            curr += count;
        }
        longest = Math.max(longest, curr);
        return Math.max(count, longest);
    }
    public int longestValidParentheses(String s){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            } else{
                stack.pop();
                if(stack.isEmpty()) {
                    stack.push(i);
                } else{
                    max = Math.max(max, i-stack.peek());
                }
            }
        }
        return max;
    }
}
