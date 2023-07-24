import java.util.*;

public class shortestPalindromeString {
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("hawaii"));
    }

    public static String shortestPalindrome1(String s) {
        int i = s.length() - 1;
        Queue<String> holder = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        while (i >= 0) {
            String curr = String.valueOf(s.charAt(i));
            if (holder.size() > 0 && stack.size() > 0 && !stack.peek().equals(curr)) {
                while (holder.size() > 0) {
                    stack.push(holder.poll());
                }
                stack.push(curr);
            } else if ((stack.size() > 0 && !stack.peek().equals(curr)) || stack.size() == 0) {
                stack.push(curr);
            } else {
                String temp = stack.pop();
                holder.offer(temp);
                holder.offer(temp);
            }
            i--;
        }
        if (stack.size() != 0)
            stack.pop();
        while (stack.size() != 0) {
            s = stack.pop() + s;
        }
        return s;
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public static String shortestPalindrome2(String s) {
        int i = 0;
        String surplus = "";
        String init = s;
        while (!isPalindrome(s) && i < s.length()) {
            surplus += s.charAt(s.length() - i - 1);
            s = surplus + init;
            i++;
        }
        return s;
    }

    public static String reverse(String s) {
        if (s.length() > 1) {
            return reverse(s.substring(1)) + String.valueOf(s.charAt(0));
        } else {
            return s;
        }
    }

    public static String shortestPalindrome(String s) {
        String rev = reverse(s);
        String comb = s + "#" + rev;
        int[] array = new int[comb.length()];
        for (int i = 1, j=0; i < comb.length(); i++) {
            while (j > 0 && comb.charAt(i) != comb.charAt(j)) {
                j = array[j - 1];
            }
            if (comb.charAt(i) == comb.charAt(j)) {
                j++;
            }
            array[i] = j;
        }
        return rev.substring(0, (comb.length() - array[comb.length() - 1])) + s;
    }

    public static String shortestPalindrome3(String s) {
        String reversedS = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + reversedS;
        int n = combined.length();
        int[] lps = new int[n];

        // Compute the LPS array (Longest Prefix Suffix)
        for (int i = 1; i < n; i++) {
            int j = lps[i - 1];
            while (j > 0 && combined.charAt(i) != combined.charAt(j)) {
                j = lps[j - 1];
            }
            if (combined.charAt(i) == combined.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }

        int shortestPalindromeLength = n - lps[n - 1];
        String shortestPalindrome = s.substring(0, shortestPalindromeLength) + reversedS;
        return shortestPalindrome;
    }
}
