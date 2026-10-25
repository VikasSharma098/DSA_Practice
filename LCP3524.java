//LCP3524: https://leetcode.com/problems/find-x-value-of-array-i/?envType=daily-question&envId=2026-10-25
class Solution {
    public long[] resultArray(int[] A, int k) {
         long[] res = new long[k];
        int[] freq = new int[k];

        for (int n : A) {
            n %= k;
            int[] cur = new int[k];
            cur[n]++;

            for (int x = 0; x < k; x++)
                cur[x * n % k] += freq[x];

            freq = cur;
            for (int x = 0; x < k; x++)
                res[x] += freq[x];
        }

        return res;
    }
}