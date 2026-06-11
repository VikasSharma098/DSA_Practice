class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;
        int ans = 10;
        int digits = 9;
        int num = 9;
        while (n-- > 1 && num > 0) {
            num *= digits;
            ans += num;
            digits--;
        }
        return ans;
    }
}