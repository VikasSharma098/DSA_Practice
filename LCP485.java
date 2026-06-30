//LCP485: Max Consecutive Ones
//https://leetcode.com/problems/max-consecutive-ones/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        for (int n : nums) {
            if (n == 0) {
                count = 0;
            } else {
                count++;
            }
            if (ans < count) {
                ans = count;
            }
        }
        return ans;
    }
}