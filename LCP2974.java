class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] s = new int[nums.length];
        for(int i = 0;i<nums.length;i+=2){
            s[i]=nums[i+1];
            s[i+1] = nums[i];

        }
        return s;
        
    }
}