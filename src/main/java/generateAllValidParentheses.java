import java.util.ArrayList;
import java.util.List;
public class generateAllValidParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        helper(list, 0, 0, "", n);
        return list;
    }
    public void helper(List<String> list, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            list.add(s);
            return;
        }
        if (left < n) {
            helper(list, left + 1, right, s + "(", n);
        }
        if (right < left) {
            helper(list, left, right + 1, s + ")", n);
        }
    }
}
