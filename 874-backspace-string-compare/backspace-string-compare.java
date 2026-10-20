import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
       return backspace(s).equals(backspace(t));
    }
    private String backspace(String s)
    {
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray())
        {
            if(c!='#')
             stack.push(c);
            else if(!stack.isEmpty())
             stack.pop();
        }
        while(!stack.isEmpty())
        {
            sb.append(stack.removeLast());
        }
        return sb.toString();
    }

    }


