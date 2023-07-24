import java.util.Arrays;

public class longComPrefix {
    public static void main(String[] args) {
        String[] strset = new String[]{"ab", "a"};
        System.out.println(longestCommonPrefix(strset));
    }
    public static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        int i = 0;
        while(i < strs[0].length()){
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        return strs[0].substring(0,i);
    }
}
