//LCP3014: https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/submissions/2086879620/?envType=daily-question&envId=2026-07-30
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += i / 8 + 1;
        }
        return ans;
    }
}