//LCP3731: Find Missing Elements
//https://leetcode.com/problems/find-missing-elements/?envType=daily-question&envId=2026-08-04
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                ans.add(j);
            }
        }
        return ans;
    }
}