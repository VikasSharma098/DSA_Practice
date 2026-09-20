//LCP3498: https://leetcode.com/problems/reverse-degree-of-a-string/?envType=daily-question&envId=2026-09-20
class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 1; i <= s.length(); i++) {
            ans += (26 - (s.charAt(i - 1) - 'a')) * i;
        }
        return ans;
    }
}