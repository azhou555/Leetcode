public class containerMostWater {
    public static int maxArea(int[] height){
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i<j){
            int x = Math.min(height[i], height[j])*(j-1);
            if(x > max){
                max = x;
            } if(height[i] < height[j]){
                i++;
            } else{
                j--;
            }
        }
        return max;
    }
}
