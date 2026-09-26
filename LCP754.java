//LCP754: Reach a Number
//https://leetcode.com/problems/reach-a-number/
class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int x = 0;
        int sum = 0;
        while (sum < target) {
            x++;
            sum += x;

        }
        while ((sum - target) % 2 != 0) {
            x++;
            sum += x;
        }
        return x;
    }
}