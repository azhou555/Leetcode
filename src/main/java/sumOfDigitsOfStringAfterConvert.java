public class sumOfDigitsOfStringAfterConvert {
    public int getLucky(String s, int k) {
        int curr = 0;
        for (char ch : s.toCharArray()) {
            int position = ch - 'a' + 1;
            while (position > 0) {
                curr += position % 10;
                position /= 10;
            }
        }
        for (int i = 0; i < k; i++) {
            int sum = 0;
            while (curr > 0) {
                sum += curr % 10;
                curr /= 10;
            }
            curr = sum;
        }
        return curr;
    }
}
