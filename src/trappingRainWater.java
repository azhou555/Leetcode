import java.util.*;
public class trappingRainWater {
    public static void main(String[] args) {
        int[] height = {1, 0, 1, 4, 2, 3};
        System.out.println(trap(height));
    }
    public static int trap1(int[] height){
        int benchmark1 = 0;
        int count = 0;
        for(int i = 0; i< height.length; i++){
            if(height[i] > benchmark1){
                benchmark1 = height[i];
            } else{
                count += benchmark1-height[i];
                System.out.println(i+", "+count+", "+benchmark1);
            }
        } return count;
    }
    public static int trap(int[] height){
        int lmax = 0;
        int rmax = 0;
        int i = 0;
        int j = height.length-1;
        int count = 0;
        while(i<j){
            if(height[i] < height[j]){
                if(height[i] > lmax){
                    lmax = height[i];
                } else{
                    count += lmax-height[i];
                }
                i++;
            } else{
                if(height[j] > rmax){
                    rmax = height[j];
                } else{
                    count += rmax-height[j];
                }
                j--;
            }
            System.out.println(i+", "+j+", "+count);
        }
        return count;
    }
}
