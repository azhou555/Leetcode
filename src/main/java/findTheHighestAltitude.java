public class findTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int height = 0;
        int max = 0;
        for (int j : gain) {
            height += j;
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}
