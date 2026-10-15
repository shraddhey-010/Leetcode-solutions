class Solution {
    public boolean isPalindrome(int x) {
            int y=x;
            int reverse=0;
           if(x<0)
           {
              return false;
            }
         while(x>0)
            {             
                 reverse =reverse*10;

                 int last=x%10;
                 reverse=reverse+last;
                 x=x/10;
            }
          if (reverse==y)
           {
              return true;
           }

        return false;
        
    }
}