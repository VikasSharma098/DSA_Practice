//LCP2913: Subarrays with K Distinct Elements
//https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/?envType=daily-question&envId=2026-10-15
class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size(),
                res = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> s = new HashSet<>();
            for (int j = i; j < n; j++) {
                s.add(nums.get(j));
                res += s.size() * s.size();
            }
        }
        return res;
    }
}