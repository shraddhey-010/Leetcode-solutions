class Solution {
    public boolean isPalindrome(int x) {
        String a=String.valueOf(x);
        char [] arr=new char[a.length()];

        for(int i=0;i<a.length();i++)
        {
            arr[i]=a.charAt(i);

        }

     
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            char temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
        }
       
        for(int k=0;k<a.length();k++)
        {
            if(arr[k]!=a.charAt(k))
            {
                return false;
            }
        }
        return true;
    }
}
       