//LCP12: Integer to Roman
//https://leetcode.com/problems/integer-to-roman/
class Solution {
    public String intToRoman(int num) {
        final int[] n = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        final String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n.length; ++i) {
            if (num == 0)
                break;
            while (num >= n[i]) {
                sb.append(symbols[i]);
                num -= n[i];
            }
        }

        return sb.toString();
    }
}