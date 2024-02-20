public class mergingSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n){
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
