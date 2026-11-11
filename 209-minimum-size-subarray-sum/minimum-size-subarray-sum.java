class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=1;int right=nums.length;int ans=0;
        while(left<=right)
        {
           int mid=left+(right-left)/2;
           if(isvalid(mid,target,nums))
           {
            ans=mid;
            right=mid-1;
           }
           else{
            left=mid+1;
           }
        }
        return ans;
        
    }
    private boolean isvalid(int mid,int target,int[]nums)
    {   long sum=0;
        for(int i=0;i<mid;i++)
        {
            sum=sum+nums[i];
        }
        if(sum>=target)
        {
            return true;

        }  
        for(int j=mid;j<nums.length;j++)
        {
            sum=sum+nums[j]-nums[j-mid];
             
          if(sum>=target)
          {
             return true;
          }

        } 
        return false;
        
    }
}