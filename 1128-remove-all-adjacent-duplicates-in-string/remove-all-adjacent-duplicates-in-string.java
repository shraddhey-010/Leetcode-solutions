class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack=new ArrayDeque<>(); 
        char [] arr= s.toCharArray();
        for(char c: arr)
        {
            if(!stack.isEmpty()&& stack.peek()==c)
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }

        }
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();

        
    }
}