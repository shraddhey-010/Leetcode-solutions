class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;int right=0;int max=0;
        for(int m:nums)
        {
            max=Math.max(max,m);
        }
        right=max;int ans=1;
        while(left<=right)
        {  int mid=left+(right-left)/2;
            if(is_divisor(nums,threshold,mid))
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
    private boolean is_divisor(int []nums,int threshold,int mid)
    {   int sum=0;
        for(int e:nums)
        {
            sum=sum+(int)Math.ceil((double)e/mid);
        }
        return sum<=threshold;
    }
}