class Solution {
public:
    int fib(int n) {
        if(n==0)
        {
            return 0;
        }
        else if (n==1)
        {
            return 1;
        } 
        int first_term=0;
        int second_term=1;
         int third_term=0;
        for(int i=1;i<=n-1;i++)
        {    
            third_term=first_term+second_term;  
            first_term=second_term;
            second_term=third_term;
        }
        return third_term;
    }

};