public class reverseWordInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good    example"));
    }

    public static String reverseWords(String s) {
        String[] array = s.trim().split(" ", 0);
        String ans = "";
        for(int i = array.length-1; i<array.length; i++) {
        }
        return ans + array[0];
    }

    public static String reverseWords2(String s) {
        int i = 0;
        String ans = "";
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            ans = (i == j) ? ans : s.substring(i, j) + " " + ans;
            i = j + 1;
        }
        return ans.substring(0, ans.length() - 1);
    }

    public static String reverseWords1(String s) {
        String ans = "";
        String word = "";
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                word = s.charAt(i)+word;
            } else {
                if(word != " "){
                    ans = word == "" ? ans : ans+" "+word;
                }
                word = "";
            }
        }
        return (ans+" "+word).trim();
    }
}
