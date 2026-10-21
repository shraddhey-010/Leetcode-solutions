import java.util.*;

class Solution {
    public int longestValidParentheses(String s) {
        int [] arr= new int[s.length()+1];
         int top=0;
         arr[top] =-1;
         int length=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                if(top!=0)
                {
                    top--;
                    length=Math.max(length,(i-arr[top]));
                }
                else
                {
                    arr[top]=i;
                }
                
            } 
            else
            {
                 
              top++;
              arr[top]=i;
        
            }
        }
        
        return length;
    }
}
         