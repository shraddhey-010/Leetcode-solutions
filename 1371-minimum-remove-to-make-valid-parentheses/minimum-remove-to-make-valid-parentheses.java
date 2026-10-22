import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] garbage=new int [s.length()];
        int index=0;
        int  bound=0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                stack.push(i);
            } 
            else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    
                   garbage[index++]=i;; 
                }
            }
        
        }
        while (!stack.isEmpty()) {
            garbage[index++]=stack.pop();
            
        }
        Arrays.sort(garbage,0,index);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (bound<index && garbage[bound]==i) {
               bound++;
            }
            else{
                 result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}