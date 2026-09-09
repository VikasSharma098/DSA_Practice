//LCP3871: https://leetcode.com/problems/count-commas-in-range-ii/?envType=daily-question&envId=2026-09-09
class Solution {
    public long countCommas(long n) {
        long p = 1000, ans = 0;
        while (p <= n) {
            ans += n - p + 1;
            p *= 1000;
        }
        return ans;
    }
}