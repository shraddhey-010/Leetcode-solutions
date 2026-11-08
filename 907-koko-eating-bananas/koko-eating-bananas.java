class Solution {
    public int minEatingSpeed(int[] piles, int h)
   {
        int max=0;
        for(int x : piles)
        {
            max=Math.max(max,x);
        }
        int left=1;int right=max;int ans=max;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(valid_speed(mid,piles,h))
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

    private boolean valid_speed(int mid,int[] arr,int h)
    { long total_hours_spent=0;
      for(int y : arr)
      {
          total_hours_spent= total_hours_spent + (int)Math.ceil((double)y/mid);
        }
      if(total_hours_spent<=h)
        {
            return true;
        }
     return false;
        
    }
}