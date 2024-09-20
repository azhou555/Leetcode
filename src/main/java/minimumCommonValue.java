public class minimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2){
        if(nums1[nums1.length-1]<nums2[0]||nums2[nums2.length-1]<nums1[0]){
            return -1;
        }
        int i = 0; 
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            int n = nums1[i], m = nums2[j];
            if(nums1[i] == nums2[j]){
                return n;
            } else if(n < m){
                i++;
            } else{
                j++;
            }
        }
        return -1;
    }
}
