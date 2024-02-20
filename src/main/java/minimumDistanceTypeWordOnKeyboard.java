public class minimumDistanceTypeWordOnKeyboard {
    public int minimumDistance(String word){
        int row = (word.charAt(0)-'A')/6;
        int col = (word.charAt(0)-'A')%6;
        return helper(word, 1, col, row, -1, -1, 0);
    }
    public int helper(String word, int index, int p1x, int p1y, int p2x, int p2y, int distance){
        if(index == word.length()){
            return distance;
        }
        int row = (word.charAt(index)-'A')/6;
        int col = (word.charAt(index)-'A')%6;
        int distance1 = distance + Math.abs(p1x - col) + Math.abs(p1y - row);
        int distance2 = distance + Math.abs(p2x - col) + Math.abs(p2y - row);
        if(p2x == -1){
            return Math.min(helper(word, index+1, col, row, -1, -1, distance1), helper(word, index+1, p1x, p1y, col, row, distance));
        } else {
            return Math.min(helper(word, index+1, col, row, p2x, p2y, distance1), helper(word, index+1, p1x, p1y, col, row, distance2));
        }
    }
}