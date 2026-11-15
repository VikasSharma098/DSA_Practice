//LCP896: Monotonic Array
//https://leetcode.com/problems/monotonic-array/
class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return true;

        boolean Inc = true;
        boolean Dec = true;

        for (int i = 1; i < n; i++) {
            if (!Inc && !Dec) {
                return false;
            }

            if (nums[i] < nums[i - 1]) {
                Inc = false;
            }
            if (nums[i] > nums[i - 1]) {
                Dec = false;
            }
        }

        return Inc || Dec;
    }
}