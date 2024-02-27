import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class longestValidParentheses32Test {
    @Test
    void testLongestValidParentheses() {
        assertEquals(4, longestValidParentheses32.longestValidParentheses(")()())"));
        assertEquals(2, longestValidParentheses32.longestValidParentheses("(()"));
        assertEquals(4, longestValidParentheses32.longestValidParentheses("()()"));
    }
}
