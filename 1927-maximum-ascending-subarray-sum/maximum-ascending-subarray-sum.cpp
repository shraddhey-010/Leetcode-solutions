class Solution {
public:
    int maxAscendingSum(vector<int>& nums)
     {
       int ans=nums[0];
       int currentmax=nums[0];
       for(int i = 1; i < nums.size(); i++)
       {
            if(nums[i-1]<nums[i])
              {
              currentmax=currentmax + nums[i];
             }
            else 
             {
             ans=max(ans,currentmax);
             currentmax=nums[i];
             }
       } 
       ans=max(ans,currentmax);
       return ans;
     }
};