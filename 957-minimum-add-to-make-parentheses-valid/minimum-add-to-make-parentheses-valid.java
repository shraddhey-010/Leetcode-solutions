import java.util.*;
class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stack= new ArrayDeque<>();
        for(char c:  s.toCharArray())
        {
           char current = c;
           if(current=='(')  
            stack.push('(');
           else if(!stack.isEmpty() && stack.peek()=='(')
            stack.pop();
           else 
            stack.push(current);

        }
        return stack.size();

        
    }
}