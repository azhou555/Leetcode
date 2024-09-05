import java.util.Arrays;
public class heightCheck {
    public int heightChecker1(int[] heights){
        int[] correct = new int[heights.length];
        for(int i = 0; i< heights.length; i++){
            correct[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for(int i = 0; i< heights.length; i++){
            if(correct[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
    public int heightChecker(int[] heights) {
        int[] heightCounts = new int[101];
        for (int height : heights) {
            heightCounts[height]++;
        }
        int mismatchCount = 0;
        int currentHeight = 0;
        for (int i = 0; i < heights.length; i++) {
            while (heightCounts[currentHeight] == 0) {
                currentHeight++;
            }
            if (heights[i] != currentHeight) {
                mismatchCount++;
            }
            heightCounts[currentHeight]--;
        }
        return mismatchCount;
    }
}
