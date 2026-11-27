class Solution {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(-1);
        int longest_valid=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' )
            {
                stack.push(i);
            }

            else
            {   
                stack.pop();

                if(stack.isEmpty())
                {
                    stack.push(i);
                }
                else
                {
                    longest_valid=Math.max(longest_valid,i-stack.peek());
                }

            }
        }
        return longest_valid;
    }
}
            
            
             