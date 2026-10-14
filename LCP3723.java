//LCP3723: https://leetcode.com/problems/maximize-sum-of-squares-of-digits/?envType=daily-question&envId=2026-10-14
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num)
            return "";
        StringBuilder ans = new StringBuilder();
        while (num-- > 0) {
            int digit = Math.min(9, sum);
            ans.append(digit);
            sum -= digit;
        }

        return sum == 0 ? ans.toString() : "";
    }
}