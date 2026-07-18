//LCP1979: Find the Greatest Common Divisor of Array
//https://leetcode.com/problems/find-greatest-common-divisor-of-array/?envType=daily-question&envId=2026-07-18
class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return gcd(min, max);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}