class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
         * int x = nums.length;
         * for(int i = 0; i<x-1; i++){
         * for(int j = i+1; j<x; j++){
         * if(nums[i]==nums[j])
         * return true;
         * 
         * }
         * }
         * return false;
         * 
         * }
         * }
         */
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
}
