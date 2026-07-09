//LCP1250: Check If It Is a Good Array
//https://leetcode.com/problems/check-if-it-is-a-good-array/
class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd = nums[0];
        for (int num : nums) {
            gcd = gcd(gcd, num);
            if (gcd == 1) {
                return true;
            }
        }
        return false;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}