//LCP2124 : https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/?envType=daily-question&envId=2026-11-22
class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int lastA = -1;
        int firstB = n;
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == 'a') {
                lastA = Math.max(lastA, i);
            } else {
                firstB = Math.min(firstB, i);
            }
        }
        return lastA < firstB;
    }
}