//LCP560: Subarray Sum Equals K
//https://leetcode.com/problems/subarray-sum-equals-k/
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int[] a = new int[2];

        for (int x : nums) {
            a[0] += x;
            a[1] += map.getOrDefault(a[0] - k, 0);
            map.merge(a[0], 1, Integer::sum);
        }

        return a[1];
    }
}