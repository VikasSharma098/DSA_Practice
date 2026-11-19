//LCP2567 : https://leetcode.com/problems/minimum-score-by-changing-two-elements/?envType=daily-question&envId=2026-11-19
class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.min(
                Math.min(nums[n - 3] - nums[0], nums[n - 2] - nums[1]),
                nums[n - 1] - nums[2]);
    }
}