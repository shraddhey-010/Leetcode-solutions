class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;int right=0;int max_capacity=0;int max=0;
        for(int s:weights)
        {

            max=Math.max(max,s);
            max_capacity=max_capacity+s;
        }
        right=max_capacity;
        left=max;
        int ans=max_capacity;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(valid_capacity(mid,weights,days))
            {
                ans=mid;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }

        }
        return ans;

    }
    
   private boolean valid_capacity(int capacity, int[] weights, int days) {
        int days_required = 1; 
        int current_weight = 0; 
        
        for (int w : weights) {
            if (current_weight + w > capacity) {
                days_required++;  
                current_weight = w; 
            } else {
                current_weight += w; 
            }
        }
        return days_required<=days;
    }
}