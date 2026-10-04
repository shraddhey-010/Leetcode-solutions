class Solution {
    public String longestCommonPrefix(String[] strs) 
    {

       if (strs==null||strs.length==0)
       {
        return " " ;
       }


        
        char [] base_string=strs[0].toCharArray();
        for (int i=0;i<base_string.length;i++)
        {
          char  current_char=base_string[i];
          for(int j=1;j<strs.length;j++)
          {
            if(i>=strs[j].length()|| strs[j].charAt(i)!=current_char)
            {
            
                return strs[0].substring(0,i);
            }
          }
        }

        return strs[0];
    }
}