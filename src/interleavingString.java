import java.util.Arrays;

public class interleavingString {

	public static boolean isInterleave1(String s1, String s2, String s3) {
		int a = 0;
		int b = 0;
		char sb1, sb2, sb3;
		if (s3.length() != s1.length() + s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length() + s2.length(); i++) {
			if (a < s1.length())
				sb1 = s1.charAt(a);
			else
				sb1 = ' ';
			if (b < s2.length())
				sb2 = s2.charAt(b);
			else
				sb2 = ' ';
			sb3 = s3.charAt(i);
			if (sb1 == sb3)
				if (sb2 == sb3)
					return isInterleave1(s1.substring(a + 1), s2.substring(b), s3.substring(i + 1))
							|| isInterleave1(s1.substring(a), s2.substring(b + 1), s3.substring(i + 1));
				else
					a++;
			else if (sb2 == sb3)
				b++;
			else {
				return false;
			}
		}
		return true;
	}

	public static boolean isInterleave2(String s1, String s2, String s3) {
		if (s1.length() + s2.length() != s3.length())
			return false;
		if(s3.length() == 0)
			return true;
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		helper(0, 0, 0, dp, s1, s2, s3);
		System.out.println(Arrays.deepToString(dp));
		return dp[s1.length()][s2.length()] == s3.length();
	}

	public static void helper(int i, int j, int c, int[][] dp, String s1, String s2, String s3) {
		if (i<s1.length() && s1.charAt(i) == s3.charAt(c)) {
			if(dp[i+1][j] == dp[i][j]+1 && c==i+j+1) {
				return;
			}
			dp[i + 1][j] = Math.max(dp[i][j] + 1, dp[i+1][j]);
			helper(i + 1, j, c+1, dp, s1, s2, s3);
		}
		if (j < s2.length() && s2.charAt(j) == s3.charAt(c)) {
			if(dp[i][j+1] == dp[i][j]+1 && c==i+j+1) {
				return;
			}
			dp[i][j + 1] = Math.max(dp[i][j] + 1, dp[i][j+1]);
			helper(i, j + 1, c+1, dp, s1, s2, s3);
		}
	}
	public static boolean isInterleave(String s1, String s2, String s3) {
		int a = s1.length(), b = s2.length(), c = s3.length();
		if (a + b != c)
			return false;
		boolean[] dp = new boolean[b + 1];
		dp[0] = true;
		for (int j = 1; j <= b; ++j) {
			dp[j] = dp[j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
		}
		for (int i = 1; i <= a; ++i) {
			dp[0] = dp[0] && s1.charAt(i - 1) == s3.charAt(i - 1);
			for (int j = 1; j <= b; ++j) {
				dp[j] = (dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
			}
		}
		return dp[b];
	}
}
