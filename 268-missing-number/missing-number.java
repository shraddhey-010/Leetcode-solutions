class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected_sum = (n * (n + 1)) / 2;
        int array_sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            array_sum += nums[i];
        }
        
        return expected_sum - array_sum;
    }
}