class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index + 1) {
                return new int[] { nums[index], index + 1 };
            }
        }

        return new int[] { -1, -1 };
    }

    private void swap(int[] arr, int n1, int n2) {
        int t = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = t;
    }
}