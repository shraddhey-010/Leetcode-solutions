import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        Set<Integer> indexesToRemove = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    indexesToRemove.add(i); 
                }
            }
        
        }
        while (!stack.isEmpty()) {
            indexesToRemove.add(stack.pop());
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!indexesToRemove.contains(i)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}