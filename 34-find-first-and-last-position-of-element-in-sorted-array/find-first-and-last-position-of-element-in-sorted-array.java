class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int[] result = {-1, -1};
        result[0] = findFirst(nums, target, 0, nums.length - 1);
        result[1] = findLast(nums, target, 0, nums.length - 1);
        return result;
    }

    private int findFirst(int[] nums, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            int left = findFirst(nums, target, start, mid - 1);
            return left != -1 ? left : mid;
        } else if (nums[mid] < target) {
            return findFirst(nums, target, mid + 1, end);
        }
        return findFirst(nums, target, start, mid - 1);
    }

    private int findLast(int[] nums, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            int right = findLast(nums, target, mid + 1, end);
            return right != -1 ? right : mid;
        } else if (nums[mid] < target) {
            return findLast(nums, target, mid + 1, end);
        }
        return findLast(nums, target, start, mid - 1);
    }
}