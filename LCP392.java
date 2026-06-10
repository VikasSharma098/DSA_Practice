class Solution {
    public boolean isSubsequence(String s, String t) {
        int x = 0;
        int n = 0;
        while (x < s.length() && n < t.length()) {
            if (s.charAt(x) == t.charAt(n)) {
                x++;
            }
            n++;
        }
        return x == s.length();
    }
}