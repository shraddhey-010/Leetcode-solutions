class Solution { 
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {

            sum=sum+nums[i];
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        int min_no_of_moves=sum-(nums.length*min);
        return  min_no_of_moves;


        
    }
}