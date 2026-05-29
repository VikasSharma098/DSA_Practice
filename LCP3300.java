class Solution {
    public int minElement(int[] nums) {
        int a = 36;
        for (int n : nums)
            a = Math.min(a, n - 9 * ((n / 10) + (n / 100) + (n / 1000) + (n / 10000)));
        return a;

    }
}