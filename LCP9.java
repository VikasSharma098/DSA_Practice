//LCP9: Palindrome Number
//https://leetcode.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int x) {
        int t = x;
        int rev = 0;
        while (t > 0) {
            int rem = t % 10;
            rev = rev * 10 + rem;
            t /= 10;
        }
        if (x == rev) {
            return true;
        }
        return false;

    }
}