//LCP3754: Concatenate Non-Zero Digits and Multiply by Sum
//https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/?envType=daily-question&envId=2026-07-07
class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = c - '0';
            sum += d;
            if (d > 0) {
                x = x * 10 + d;
            }
        }
        return x * sum;

    }
}