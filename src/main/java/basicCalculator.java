import java.util.Stack;

public class basicCalculator {

    public int calculate1(String s) {
        int curr = 0;
        int prev = 0;
        bool add = null;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
            } else if (s.charAt(i) == '(') {
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) == ')') {
                        curr = calculate(s.substring(i + 1, j));
                        System.out.println(curr);
                    }
                    i = j;
                }
            } else if (s.charAt(i) == '+') {
                add = bool.TRUE;
                prev = curr;
                curr = 0;
            } else if (s.charAt(i) == '-') {
                add = bool.FALSE;
                prev = curr;
                curr = 0;
            } else {
                if (add != null) {
                    while (i < s.length() && Character.isDigit(s.charAt(i))) {
                        curr = curr * 10 + Character.getNumericValue(s.charAt(i));
                        i++;
                    }
                    prev = add == bool.TRUE ? prev + curr : prev - curr;
                    curr = 0;
                } else {
                    curr = curr * 10 + Character.getNumericValue(s.charAt(i));
                }
            }
        }
        return prev;
    }
    public int calculate(String s){
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int num = 0;
        int operand = 1;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = 10*num+(int)(c- '0');
            } else if(c == '+'){
                result += operand*num;
                num = 0;
                operand = 1;
            } else if(c == '-'){
                result += operand*num;
                num = 0;
                operand = -1;
            } else if(c == '('){
                stack.push(result);
                stack.push(operand);
                operand = 1;
                result = 0;
            } else if(c == ')'){
                result += operand*num;
                num = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }
        result += operand*num;
        return result;
    }
}
