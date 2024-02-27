public class solvingProblemsWithBrainpower {
    public int mostPoints(int[][] questions){
        int[][] dp = new int[questions.length][2];
        dp[0][0] = questions[0][0];
        for(int i = 0; i< dp.length; i++){

        }
        return dp[dp.length-1][1];
    }

}
