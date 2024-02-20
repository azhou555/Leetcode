public class regularExpressionMatching {
    static bool[][] dp;
    public boolean isMatch(String a, String p){
        dp =  new bool[a.length()+1][p.length()+1];
        return helper(0,0, a, p);
    }
    public boolean helper(int i, int j, String a, String p){
        if(dp[i][j] != null){
            return dp[i][j] == bool.TRUE;
        }
        boolean result;
        if(j == p.length()){
            result = i == a.length();
        } else{
            boolean match = (i<a.length() && (p.charAt(j) == a.charAt(i) || p.charAt(j) == '.'));
            if(j+1<p.length() && p.charAt(j+1) == '*'){
                result = (helper(i, j+2, a, p) || match && helper(i+1, j, a, p));
            } else{
                result = match && helper(i+1, j+1, a, p);
            }
        }
        dp[i][j] = result ? bool.TRUE : bool.FALSE;
        return result;
    }
    public boolean isMatch2(String a, String p) {
        char[] arrayA = a.toCharArray();
        char[] arrayP = p.toCharArray();
        if (arrayA.length == 0) {
            if (arrayP.length == 0) {
                return true;
            } else {
                if (arrayP.length > 1) {
                    if (arrayP[1] == '*') {
                        return isMatch(a, p.substring(2));
                    } else {
                        return false;
                    }
                }
                return false;
            }
        }
        if (arrayP.length == 0) {
            return false;
        }
        if (arrayP[0] == '.') {
            if (arrayP.length > 1) {
                if (arrayP[1] == '*') {
                    return isMatch(a.substring(1), p) || isMatch(a, p.substring(2));
                }
            }
            return isMatch(a.substring(1), p.substring(1));
        } else {
            if (arrayP.length > 1 && arrayP[1] == '*') {
                if (arrayP[0] == arrayA[0]) {
                    System.out.println(a+" "+p);
                    return isMatch(a, p.substring(2)) || isMatch(a.substring(1), p);
                } else{
                    return isMatch(a, p.substring(2));
                }
            } else if (arrayP[0] != arrayA[0]) {
                return false;
            } else {
                return isMatch(a.substring(1), p.substring(1));
            }
        }
    }
    public boolean isMatch1(String a, String p){
        char[] arrayA = a.toCharArray();
        char[] arrayP = p.toCharArray();
        int c = 0;
        char temp;
        for(int i = 0; i<arrayP.length; i++){
            if(arrayP[i]=='.'){
                if(i!= arrayP.length-1 && arrayP[i+1] == '*') {
                    while (arrayA.length > i+c+1){
                        if(!isMatch(a.substring(i+c+1, a.length()-1), p.substring(i+1, p.length()-1))) {
                            c++;
                        }
                    }
                    i++;
                    c--;
                }
            } else{
                if(i+c < arrayA.length && arrayP[i] != arrayA[i+c]){
                    System.out.println("Non-matching");
                    System.out.println(i+" "+ c);
                    return false;
                }
                else if(i!= arrayP.length-1 && arrayP[i+1] == '*'){
                    temp = arrayP[i];
                    while(i+c+1 < arrayA.length && arrayA[i+c+1] == temp){
                        System.out.println("* thingy "+i+" "+c);
                        c++;
                    } i++;
                    c--;

                }
            }
            if(arrayA.length-1 == i+c && i == arrayP.length-1){
                return true;
            }
        }
        if(arrayP.length+c!= arrayA.length){
            System.out.println(c);
            System.out.println("Baddy");
            return false;
        }
        return true;
    }
}
