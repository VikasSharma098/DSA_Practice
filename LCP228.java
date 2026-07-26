//LCP228: Maximum Product of Three Numbers
//https://leetcode.com/problems/maximum-product-of-three-numbers/?envType=daily-question&envId=2026-07-26
class Solution {
    public int maximumProduct(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        return Math.max(
                A[n - 1] * A[n - 2] * A[n - 3],
                A[n - 1] * A[0] * A[1]);
    }
}
