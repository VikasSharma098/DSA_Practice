//LCP1464: Maximum Product of Two Elements in an Array
//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/?envType=daily-question&envId=2026-07-27
class Solution {
    public int maxProduct(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                ans = Math.max(ans, (nums[i] - 1) * (nums[j] - 1));
            }
        }

        return ans;
    }
}