import java.util.Arrays;

public class wildcardMatching {
    static bool[][] dp;
    public static boolean isMatch(String a, String p){
        int i = 0;
        int j = 0;
        int m = 0;
        int star = -1;
        while(i<a.length()){
            if(j<p.length() && a.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
                i++;
                j++;
            } else if(j < p.length() && p.charAt(j) == '*'){
                star = j;
                m = i;
                j++;
            } else if(star != -1){
                j = star+1;
                m++;
                i = m;
            } else{
                return false;
            }
        }
        while(j < p.length() && p.charAt(j) == '*'){
            j++;
        }
        return j == p.length();
    }
    public static boolean isMatch1(String a, String p){
        dp =  new bool[a.length()+1][p.length()+1];
        return helper(0,0, a, p);
    }
    public static boolean helper(int i, int j, String a, String p){
        if(dp[i][j] != null){
            return dp[i][j] == bool.TRUE;
        }
        boolean result;
        if(j == p.length()){
            result = i == a.length();
        } else if(i == a.length()){
            return p.charAt(j) == '*' && j == p.length() - 1;
        }
        else{
            System.out.println(i+", "+j);
            if(j< p.length() && i<a.length() && p.charAt(j) == '*'){
                result = helper(i + 1, j, a, p) || helper(i, j + 1, a, p);
            } else{
                boolean match = (i<a.length() && (p.charAt(i) == a.charAt(j) || p.charAt(i) == '?'));
                result = match && helper(i+1, j+1, a, p);
            }
        }
        dp[i][j] = result ? bool.TRUE : bool.FALSE;
        return result;
    }
}
