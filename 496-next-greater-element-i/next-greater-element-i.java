import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        
        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];
 
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            
            int nextGreater = stack.isEmpty() ? -1 : stack.peek();
            nextGreaterMap.put(current, nextGreater);
 
            stack.push(current);
        }

    
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }
}