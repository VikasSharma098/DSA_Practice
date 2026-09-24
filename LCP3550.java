//LCP3550 :https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/?envType=daily-question&envId=2026-09-24
class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int sum = 0;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            if (sum == i)
                return i;
        }

        return -1;
    }
}
