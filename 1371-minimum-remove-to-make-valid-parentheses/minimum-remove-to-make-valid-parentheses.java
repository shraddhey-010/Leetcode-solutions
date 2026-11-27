class Solution {
    public String minRemoveToMakeValid(String s) {
        boolean [] arr=new boolean[s.length()];
        StringBuilder sb= new StringBuilder();
        Deque<Integer>stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }
            else if(s.charAt(i)==')')
            {
                if(!stack.isEmpty())
                  stack.pop();

                else
                 arr[i]=true;
            }
           
        }
        while(!stack.isEmpty())
        {
            arr[stack.pop()]=true;
        }
        for(int j=0;j<s.length();j++)
        {
            if(arr[j]==false)
            {

             sb.append(s.charAt(j));
            }
        }
        return sb.toString();

        
    }
}