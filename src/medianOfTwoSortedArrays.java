public class medianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int i = 0;
        int j = 0;
        int n = nums1.length+nums2.length;
        boolean even = n%2 == 0 ? true: false;
        int index = 0;
        int last = 0;
        int curr = 0;
        while(index++ < (n/2)+1){
            last = curr;
            if(i<nums1.length && j<nums2.length){
                curr = nums1[i]<nums2[j] ? nums1[i++]: nums2[j++];
            } else if(i<nums1.length){
                curr = nums1[i++];
            } else{
                curr = nums2[j++];
            }
        }
        return even ? (curr+last)/2.0: curr;
    }
}
