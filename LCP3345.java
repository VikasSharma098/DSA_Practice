//LCP3345: https://leetcode.com/problems/smallest-divisible-digit-product-i/?envType=daily-question&envId=2026-08-06
class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {

            int x = n;
            int product = 1;

            while (x > 0) {
                product *= x % 10;
                x /= 10;
            }

            if (product % t == 0)
                return n;

            n++;
        }
    }
}