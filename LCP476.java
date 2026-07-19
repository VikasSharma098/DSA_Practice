//LCP476: Number Complement
//https://leetcode.com/problems/number-complement/
class Solution {
    public int findComplement(int num) {
        int ans = 0, index = 0;
        while (num > 0) {
            if ((num & 1) == 0)
                ans += (int) Math.pow(2, index);
            num >>= 1;
            index++;
        }
        return ans;
    }
}