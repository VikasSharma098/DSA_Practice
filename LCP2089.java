//LCP2089: Find Target Indices After Sorting Array
//https://leetcode.com/problems/find-target-indices-after-sorting-array/?envType=daily-question&envId=2026-10-24
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }
        return res;
    }
}