import java.util.ArrayList;

public class MinStack {
    public ArrayList<Integer> stack;
    public MinStack(){
        stack = new ArrayList<Integer>();
    }
    public void push(int val){
        stack.add(val);
    }
    public void pop(){
        stack.remove(stack.size()-1);
    }
    public int top(){
        return stack.get(stack.size()-1);
    }
    public int getMin(){
        java.util.Collections.sort(stack);
        return stack.get(0);
    }
}
