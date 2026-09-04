//LCP3903: https://leetcode.com/problems/smallest-stable-index-i/?envType=daily-question&envId=2026-09-04
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int maxValue = nums[i];
            int minValue = nums[i];
            for (int j = 0; j < i; j++) {
                maxValue = Math.max(maxValue, nums[j]);
            }
            for (int j = i + 1; j < n; j++) {
                minValue = Math.min(minValue, nums[j]);
            }
            if (maxValue - minValue <= k) {
                return i;
            }
        }
        return -1;
    }
}