class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        int max_capacity = 0;
        int max = 0;
        
        for(int s : weights) {
            max = Math.max(max, s);
            max_capacity = max_capacity + s;
        }
        
        right = max_capacity;
        left = max;
        int ans = max_capacity;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(valid_capacity(mid, weights, days)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return ans;
    }
    
    private boolean valid_capacity(int mid, int[] weights, int days) {
        int days_required = 1;
        int remaining_capacity = mid;
        
        for(int w : weights) {
            if(remaining_capacity >= w) {
                remaining_capacity = remaining_capacity - w;
            } else {
                days_required++;
                remaining_capacity = mid - w;
            }
        }
        
        return days_required <= days;
    }
}