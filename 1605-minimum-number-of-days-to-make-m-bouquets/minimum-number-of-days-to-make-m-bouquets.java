class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left=0;int right=0;int max=0;int min=Integer.MAX_VALUE;
        for(int c:bloomDay)
        {
            max=Math.max(max,c);
            min=Math.min(min,c);
        }
        left=min;
        right=max;int ans=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(bouquets_possible(bloomDay,m,k,mid))
            {
                right=mid-1;
                ans=mid;
            }
            else
            {
                left=mid+1;
            }

        }
        return ans;
        
    }

    private boolean bouquets_possible(int[]bloomDay,int m,int k,int mid)
    { int continuous_flowers=0;int bouquets_completed=0;
        for(int d:bloomDay)
        {
            if(d<=mid)
            {
                continuous_flowers++;
                if(continuous_flowers==k)
                {
                    bouquets_completed++;
                    continuous_flowers=0;
                }

            }
            else
            {
                continuous_flowers=0;
            }
        }
        return bouquets_completed>=m;
        
    }
}