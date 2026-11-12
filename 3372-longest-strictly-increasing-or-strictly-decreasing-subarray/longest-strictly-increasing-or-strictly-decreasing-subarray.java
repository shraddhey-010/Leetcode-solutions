class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int left_decreasing = 0;
        int left_increasing = 0;
        int max_length = 1;  
        
        for (int right = 1; right < nums.length; right++) {
            
            if (nums[right] > nums[right - 1]) {
                left_decreasing = right; 
            } 
            else if (nums[right] < nums[right - 1]) {
                left_increasing = right; 
            } 
            else {
                
                left_decreasing = right;
                left_increasing = right;
            }
            
            int current_increasing_len = right - left_increasing + 1;
            int current_decreasing_len = right - left_decreasing + 1;
            
            max_length = Math.max(max_length, Math.max(current_increasing_len, current_decreasing_len));
        }
        
        return max_length;
    }
}