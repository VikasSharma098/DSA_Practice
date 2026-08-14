//LCP3090: Maximum Length Substring With Two Occurrences
//https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/?envType=daily-question&envId=2026-08-14
class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int res = 0;
        for (int left = 0; left < n; left++) {
            int[] count = new int[26];
            for (int right = left; right < n; right++) {
                int ch = s.charAt(right) - 'a';
                count[ch]++;
                if (count[ch] > 2) {
                    break;
                }
                res = Math.max(res, right - left + 1);
            }
        }
        return res;
    }
}