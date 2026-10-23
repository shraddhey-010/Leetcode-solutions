import java.util.*;
class Solution {
    public int scoreOfParentheses(String s) 
    {int score=0;
    int value=0;
        Deque<Integer> stack=new ArrayDeque();
        stack.push(0);
        for(char c : s.toCharArray())
        {
            if(c=='(')
            {
                stack.push(0);
            }
            else{
                value=stack.pop();
                score=Math.max(2*value,1);
                stack.push(stack.pop()+score);
            }
        }
        return stack.pop();
        
    }
}