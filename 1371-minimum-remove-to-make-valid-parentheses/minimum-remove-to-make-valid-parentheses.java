import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        boolean [] garbage=new boolean [s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                stack.push(i);
            } 
            else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    
                   garbage[i]=true;;; 
                }
            }
        
        }
        while (!stack.isEmpty()) {
            garbage[stack.pop()]=true;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!garbage[i]) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}