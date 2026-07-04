//LCP343: Integer Break
//https://leetcode.com/problems/integer-break/
class Solution {
    public int integerBreak(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int threes = n / 3;
        int r = n % 3;
        if (r == 1) {
            threes -= 1;
            r = 4;
        } else if (r == 0) {
            r = 1;
        }
        return (int) (Math.pow(3, threes) * r);
    }
}