//LCP4: Median of Two Sorted Arrays
//https://leetcode.com/problems/median-of-two-sorted-arrays
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        while (i < n1) {
            result[k++] = nums1[i++];
        }
        while (j < n2) {
            result[k++] = nums2[j++];
        }

        if (result.length % 2 == 1) {
            return (double) result[(result.length) / 2];
        } else {
            return (result[result.length / 2 - 1] + result[result.length / 2]) / 2.0;
        }
    }
}