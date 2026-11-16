class Solution {
    public int removeElement(int[] nums, int val) {
        return remove(nums, val, 0, 0);
    }
    
    private int remove(int[] nums, int val, int read, int write) {
        if (read == nums.length) return write;
        if (nums[read] != val) {
            nums[write] = nums[read];
            return remove(nums, val, read + 1, write + 1);
        }
        return remove(nums, val, read + 1, write);
    }
}