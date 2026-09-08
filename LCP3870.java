//LCP3870: Count Commas in Range
//https://leetcode.com/problems/count-commas-in-range/?envType=daily-question&envId=2026-09-08
class Solution {
    public int countCommas(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i > 999) {
                ans += 1;
            }
        }
        return ans;
    }
}