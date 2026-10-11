//LCP2778: Sum of Squares of Special Elements
//https://leetcode.com/problems/sum-of-squares-of-special-elements/?envType=daily-question&envId=2026-10-11
class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            if (n % (i + 1) == 0) {
                ans += nums[i] * nums[i];
            }
        }
        return ans;
    }
}