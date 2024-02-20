import java.util.Stack;

public class parenthesisValid {
    public boolean isValid(String s){
        Stack<String> stack = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            if (s.substring(i,i+1).equals("(")||s.substring(i,i+1).equals("{")||s.substring(i,i+1).equals("[")){
                stack.add(s.substring(i,i+1));
            }
            else{
                if(stack.size() == 0){
                    return false;
                }
                switch(s.substring(i,i+1)){
                    case "}":
                        if(!stack.pop().equals("{")) {
                            return false;
                        }
                    case "]":
                        if(!stack.pop().equals("[")) {
                            return false;
                        }
                    case ")":
                        if(!stack.pop().equals("(")) {
                            return false;
                        }
                        break;
                }
            }
        }
        if(stack.size() == 0) {
            return true;
        }
        return false;
    }
}
