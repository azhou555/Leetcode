import java.util.Stack;
public class makeStringGreat {
    public String makeGood1(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(i+1 < s.length()){
                char nc = s.charAt(i+1);
                if((Character.isLowerCase(c) && nc == Character.toUpperCase(c)) || (Character.isUpperCase(c) && nc == Character.toLowerCase(c))){
                    i++;
                } else{
                    sb.append(c);
                }
            } else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public String makeGood2(String s){
        Stack<Character> stack = new Stack<>();
        int i = 0;
        stack.push(s.charAt(i));
        i++;
        while(i < s.length()){
            char nc = s.charAt(i);
            char c = stack.isEmpty() ? ' ': stack.peek();
            if ((Character.isLowerCase(c) && nc == Character.toUpperCase(c)) || (Character.isUpperCase(c) && nc == Character.toLowerCase(c))){
                stack.pop();
            } else{
                stack.push(nc);
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
    public String makeGood(String s){
        if(s.length() <= 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int i = 0;
        while(i < sb.length()-1){
            char lc = sb.charAt(i);
            char rc = sb.charAt(i+1);
            if(Math.abs(lc-rc) == 32){
                sb.delete(i, i+2);
                if(i > 0){
                    i--;
                }
            } else{
                i++;
            }
        }
        return sb.toString();
    }
}
