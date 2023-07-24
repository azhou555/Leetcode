import java.util.*;

public class OrderedStream {
    String[] stream;
    int max;

    public OrderedStream(int n) {
        this.stream = new String[n];
        this.max = 0;
    }

    public List<String> insert(int idKey, String value) {
        this.stream[idKey - 1] = value;
        List<String> ans = new ArrayList<>();
        boolean doable = idKey-1 <= max;
        if (doable) {
            int i = idKey - 1;
            while (i < stream.length && stream[i] != null) {
                ans.add(stream[i]);
                i++;
            }
            max = i;
        }
        return ans;
    }
}