class Solution {
    public int longestOnes(int[] nums, int k) {
        int left= 0;int count_zeroes=0;int max_length=Integer.MIN_VALUE;;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                count_zeroes++;
            }

            while(count_zeroes>k)
            {
                if(nums[left++]==0)
                {
                    count_zeroes--;
                }
            }
         max_length=Math.max(max_length,right-left+1);
        }
        
        return max_length;
    }
}