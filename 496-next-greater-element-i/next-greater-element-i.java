import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&& stack.peek()<nums2[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                stack.push(nums2[i]);
                map.put(nums2[i],-1);

            }
            else
            {

                map.put(nums2[i],stack.peek());
                stack.push(nums2[i]);
            }

        }
        for(int j=0;j<nums1.length;j++)
        {
            nums1[j]=map.get(nums1[j]);
        }
        return nums1;



        
    }
}