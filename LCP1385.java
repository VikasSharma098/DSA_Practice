//LCP1385: Find the Distance Value Between Two Arrays
//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int x : arr1) {
            boolean b = true;
            for (int y : arr2) {
                b &= Math.abs(x - y) > d;
            }
            count += b ? 1 : 0;
        }
        return count;
    }
}