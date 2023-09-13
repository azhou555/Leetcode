public class reverseWordInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good    example"));
    }
    public static String reverseWords(String s) {
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
        StringBuilder ans = new StringBuilder("");
        StringBuilder word = new StringBuilder("");
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                word.insert(0,s.charAt(i));
            } else {
                if(!word.equals(" ")){
                    ans = word.equals("") ? ans : word.insert(0, ans+" ");
                }
                word = new StringBuilder(" ");
            }
        }
        return (ans+" "+word).trim();
    }
}
