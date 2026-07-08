
//LCP29: Divide Two Integers
//https://leetcode.com/problems/divide-two-integers/
import java.math.*;

class Solution {
    public int divide(int dividend, int divisor) {

        int quo = dividend / divisor;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return quo;
    }
}