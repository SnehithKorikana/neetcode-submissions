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
                break;
            }
        }
        int[] indexes = new int[2];
        indexes[0] = left + 1;
        indexes[1] = right + 1;
        return indexes;
    }
}
