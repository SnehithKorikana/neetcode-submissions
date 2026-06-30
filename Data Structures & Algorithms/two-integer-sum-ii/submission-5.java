class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right;
        right = nums.length - 1;
        while (true) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                return new int[] {left + 1 , right + 1};
            }
        }
    }
}
