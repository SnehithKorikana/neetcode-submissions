class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right;
        right = nums.length - 1;
        boolean flag = true;
        while (flag) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                flag = false;
                break;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
