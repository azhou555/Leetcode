import java.util.Arrays;

public class bagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length == 0){
            return 0;
        }
        Arrays.sort(tokens);
        if(tokens[0] > power){
            return 0;
        }
        int left = 0, right = tokens.length - 1;
        int maxScore = 0, currScore = 0;
        
        while (left <= right) {
            if (power >= tokens[left]) {
                currScore++;
                power -= tokens[left++];
            } else {
                currScore--;
                power += tokens[right--];
            }
            if (currScore < 0)
                break;
            maxScore = Math.max(maxScore, currScore);
        }
        
        return maxScore;
    }
}
