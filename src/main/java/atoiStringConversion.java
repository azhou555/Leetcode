public class atoiStringConversion{
    public int myAtoi(String s){
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }
        int x = 0;
        int i = 0;
        boolean positive = true;
        if(s.charAt(0) == '-'){
            i++;
            positive = false;
        } else if(s.charAt(0) == '+'){
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (x > Integer.MAX_VALUE / 10 || (x == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            x = x* 10 + digit;
            i++;
        }

        return positive? x: -x;
    }
}