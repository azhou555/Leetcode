import java.util.Stack;
public class removeKDigits {
    public String removeKdigits(String num, int k){
        Stack<Character> stack = new Stack<>();
        for(char digit: num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() > digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        return num;
    }
}
