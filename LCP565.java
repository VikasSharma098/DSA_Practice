//LCP565: Array Nesting
//https://leetcode.com/problems/array-nesting/
class Solution {
    public int arrayNesting(int[] nums) {
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {
                continue;
            }

            int count = 0;
            int curr = i;

            while (nums[curr] >= 0) {
                int next = nums[curr];
                nums[curr] = -1;
                curr = next;
                count++;
            }

            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }
}