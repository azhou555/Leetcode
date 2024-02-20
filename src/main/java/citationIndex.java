import java.util.Arrays;

public class citationIndex {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        return binaryHelper(citations);
    }

    public int binaryHelper(int[] citations) {
        int l = 0, r = citations.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (citations[citations.length - m - 1] == m) {
                return m;
            }
            if (citations[citations.length - m - 1] > m)
                l = m + 1;
            else
                r = m - 1;
        }
        return (l+r+1)/2;
    }
}
