import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class wordBreakDictionaryTest {
    @Test
    void testWordBreak() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pen");
        assertTrue(wordBreakDictionary.wordBreak1("applepenapple", list));
    }
}
