import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
           int current_element=nums[i];
            if(set.contains((current_element)))
            {
                return true;
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return false;
    }
    
}