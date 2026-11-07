class Solution {
    public int search(int[] nums, int target) {
        int left=0;int right=nums.length-1;int mid=0;int pivot=0;
        while(left<right)
        {  mid=left+(right-left)/2;
            if(nums[mid]>nums[right])
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }

        }
        pivot=left;
        left=0;
        right=nums.length-1;
        if(target>=nums[pivot] && target<=nums[right])
        {
            left=pivot;
        }
        else
        {
            right=pivot-1;

        }
        while(left<=right)
        {  mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                return mid;
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
        return -1;
    }
}

                    
        



        