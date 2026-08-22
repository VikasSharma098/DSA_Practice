//LCP3622: Check Divisibility by Digit Sum and Product
//https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/?envType=daily-question&envId=2026-08-22
class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int i = n;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            sum += digit;
            product *= digit;
        }

        return i % (sum + product) == 0;
    }
}