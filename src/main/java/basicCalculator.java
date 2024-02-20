public class basicCalculator {

    public int calculate(String s) {
        int curr = 0;
        int prev = 0;
        bool add = null;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
            } else if (s.charAt(i) == '(') {
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) == ')') {
                        curr = calculate(s.substring(i + 1, j));
                        System.out.println(curr);
                    }
                    i = j;
                }
            } else if (s.charAt(i) == '+') {
                add = bool.TRUE;
                prev = curr;
                curr = 0;
            } else if (s.charAt(i) == '-') {
                add = bool.FALSE;
                prev = curr;
                curr = 0;
            } else {
                if (add != null) {
                    while (i < s.length() && Character.isDigit(s.charAt(i))) {
                        curr = curr * 10 + Character.getNumericValue(s.charAt(i));
                        i++;
                    }
                    prev = add == bool.TRUE ? prev + curr : prev - curr;
                    curr = 0;
                } else {
                    curr = curr * 10 + Character.getNumericValue(s.charAt(i));
                }
            }
        }
        return prev;
    }
}
