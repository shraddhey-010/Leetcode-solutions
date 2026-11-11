class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;int min_length=Integer.MAX_VALUE;long sum=0;
        for(int right =0;right<nums.length;right++)
        {
            sum=sum+nums[right];
            while(sum>=target)
            {
                min_length=Math.min(min_length,right-left+1);
                sum=sum-nums[left++];
            }
        } 
        return min_length==Integer.MAX_VALUE?0:min_length;
       
    }
}
    