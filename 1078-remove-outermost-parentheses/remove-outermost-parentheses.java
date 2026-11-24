class Solution {
    public String removeOuterParentheses(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        char[] arr=s.toCharArray();
         StringBuilder sb=new StringBuilder();
        for(char c:arr)
        {
            if(c=='(')
            {
                if(!stack.isEmpty())
                {
                    sb.append(c);
                }
                
                stack.push(c);
            }
            else
            {
              stack.pop();
              if(!stack.isEmpty())
              {
                sb.append(c);
              }
            }
             
         } 

     return sb.toString();
        
    }
}