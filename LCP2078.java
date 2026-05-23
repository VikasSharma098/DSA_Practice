class Solution {
    public int maxDistance(int[] colors) {
        int x = 0;
        for (int i = 0; i < colors.length - 1; i++) {
            int left = i, right = colors.length - 1;
            while (left < right) {
                if (colors[left] != colors[right]) {
                    int res = Math.abs(left - right);
                    x = Math.max(res, x);
                }
                right--;
            }
        }
        return x;
    }
}