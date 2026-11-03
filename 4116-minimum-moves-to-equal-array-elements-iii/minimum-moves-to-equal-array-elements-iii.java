class Solution {
    public int minMoves(int[] nums) 
    {    
        int min_moves=0;
         int max=Integer.MIN_VALUE;;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]>max)
         max=nums[i];
      }
      int j=0;
      while( j < nums.length)
      {
        min_moves=min_moves+Math.abs(max-nums[j++]);
      }
     return min_moves;     
    }
}