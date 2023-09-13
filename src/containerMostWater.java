public class containerMostWater {
    public static void main(String[] args) {
        int[] heights = {2, 3, 4, 5, 17, 18, 6};
        System.out.println(maxArea(heights));
    }
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
