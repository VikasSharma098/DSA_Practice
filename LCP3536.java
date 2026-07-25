//LCP3536: Maximum Product of Two Digits
//https://leetcode.com/problems/maximum-product-of-two-digits/?envType=daily-question&envId=2026-07-25
class Solution {
    public int maxProduct(int n) {
        int p1 = 0,
                p2 = 0;
        while (n > 0) {
            int x = n % 10;
            if (x > p1) {
                p2 = p1;
                p1 = x;
            } else if (x > p2) {
                p2 = x;
            }
            n /= 10;
        }
        return p1 * p2;
    }
}