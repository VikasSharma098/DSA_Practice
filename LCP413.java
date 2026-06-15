//LCP413: Arithmetic Slices
//https://leetcode.com/problems/arithmetic-slices/
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int x = 0;
        int sum = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                x += 1;
                sum += x;

            } else {
                x = 0;
            }
        }
        return sum;
    }
}