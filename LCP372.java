//LCP372: Super Pow
//https://leetcode.com/problems/super-pow/
class Solution {
    public int superPow(int a, int[] b) {
        int exp = 0;
        for (int digit : b) {
            exp = (exp * 10 + digit) % 1140;
        }
        if (exp == 0)
            exp = 1140;

        int ans = 1;
        a %= 1337;
        while (exp > 0) {
            if ((exp & 1) == 1)
                ans = (ans * a) % 1337;
            a = (a * a) % 1337;
            exp >>= 1;
        }
        return ans;

    }
}