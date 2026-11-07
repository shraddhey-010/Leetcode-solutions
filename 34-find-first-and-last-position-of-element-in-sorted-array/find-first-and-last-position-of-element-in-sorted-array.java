class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[]{-1,-1};
       arr[0]= binarySearch(nums,target,true);
       if(arr[0]!=-1)
       {
        arr[1]=binarySearch(nums,target,false);
       }
       return arr;
    }

    
    private int binarySearch(int[] nums, int target,boolean traverseLeft) {
         int left=0;int right=nums.length-1;int ans=-1;
        
        while(left<=right)
        {  
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                if(traverseLeft==true)
                {
                    right= mid-1;
                }
                else
                {
                    left= mid+1;

                }
            }
            
            else if(nums[mid]>target) 
            {
                right=mid-1;
            }
            else
            {

            left=mid+1;
            }
        }
        return ans ;
        
    }
}
        

