import java.util.Arrays;

public class greatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }
    public static String gcdOfStrings1(String str1, String str2){
        String max = "";
        for(int i = 1; i<Math.min(str1.length(), str2.length())+1; i++){
            if(isDivisor(str1, str1.substring(0, i)) && str2.split(str1.substring(0, i)).length == 0){
                if(str1.substring(0, i).length() > max.length()){
                    max = str1.substring(0, i);
                }
            }
        }
        return max;
    }
    public static boolean isDivisor(String word, String div){
        if(word.length()%div.length() != 0){
            return false;
        }
        for(int i = 0; i< word.length(); i++){
            if(word.charAt(i) != div.charAt(i%div.length())){
                return false;
            }
        }
        return true;
    }
    public static String gcdOfStrings2(String str1, String str2){
        for(int i = Math.min(str1.length(), str2.length()); i> 0; i--){
            String s = str1.substring(0, i);
            int m = str1.length();
            int n = str2.length();
            int k = s.length();
            if(m%k == 0 && n%k == 0){
                StringBuilder s1 = new StringBuilder("");
                StringBuilder s2 = new StringBuilder("");
                for(int j = 0; j<m/k; j++){
                    s1.append(s);
                } for(int j = 0; j<n/k; j++){
                    s2.append(s);
                }
                if(s1.toString().equals(str1) && s2.toString().equals(str2)){
                    return s;
                }
            }
        }
        return "";
    }
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
