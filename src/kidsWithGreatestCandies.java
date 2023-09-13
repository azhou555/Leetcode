
import java.util.Arrays;
import java.util.List;
public class kidsWithGreatestCandies {
    public static void main(String[] args) {

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int max = 0;
        Boolean[] ans = new Boolean[candies.length];
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max)
                max = candies[i];
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i]+extraCandies >= max){
                ans[i] = true;
            } else{
                ans[i] = false;
            }
        }
        return Arrays.asList(ans);
    }
}
