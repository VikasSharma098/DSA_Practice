class Solution {
    public int countDigits(int num) {
        int count = 0;
        int t = num;
        while (t > 0) {
            int digit = t % 10;
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            t /= 10;
        }
        return count;
    }
}