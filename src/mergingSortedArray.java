import java.util.Arrays;

public class mergingSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int[] result = merge(nums1, 3, nums2, 3);
        for(int element : result){
            System.out.print(element + ", ");
        }
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int u = m-1;
        int v = n-1;
        int w = m+n-1;
        while(v >= 0){
            if(u >= 0 && nums1[u] > nums2[v]){
                nums1[w] = nums1[u];
                w--;
                u--;
            } else{
                nums1[w] = nums2[v];
                w--;
                v--;
            }
        }
        return nums1;
    }
}
