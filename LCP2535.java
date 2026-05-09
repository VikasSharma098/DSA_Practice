class Solution {
    public int differenceOfSum(int[] nums) {
        int n1 = 0;
        int n2 = 0;
        for (int num : nums) {
            n1 += num;
            int x = num;
            while (x > 0) {
                n2 = n2 + x % 10;
                x = x / 10;
            }
        }
        return Math.abs(n1 - n2);
    }
}