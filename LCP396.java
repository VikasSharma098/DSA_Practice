//LCP396: Rotate Function
//https://leetcode.com/problems/rotate-function/
class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long s = 0;
        long p = 0;

        for (int i = 0; i < n; i++) {
            s += nums[i];
            p += (long) nums[i] * i;
        }

        long ans = p;
        long c = p;

        for (int i = 1; i < n; i++) {
            c = c + s - (long) n * nums[n - i];
            ans = Math.max(ans, c);
        }

        return (int) ans;
    }
}