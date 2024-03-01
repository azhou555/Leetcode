public class returnMaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ones = new StringBuilder();
        int count = -1;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
                if (count > 0) {
                    ones.append(c);
                }
            } else {
                sb.append(c);
            }
        }
        ones.append(sb);
        ones.append("1");
        return ones.toString();
    }
}
