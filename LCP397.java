//LCP397: Integer Replacement
//https://leetcode.com/problems/integer-replacement/
class Solution {
    public int integerReplacement(int n) {
        long num = n;
        int ans = 0;
        while (num != 1) {
            if ((num & 1) == 0)
                num >>= 1;
            else {
                if (num == 3 || num % 4 == 1)
                    num--;
                else
                    num++;
            }
            ans++;
        }
        return ans;
    }
}