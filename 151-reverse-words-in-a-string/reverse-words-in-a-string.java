class Solution {
    public String reverseWords(String s) {

        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
         StringBuilder clean = new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            char current_char=sb.charAt(i);
            if(current_char != ' ')
            {
                clean.append(current_char);
            }
            else if(clean.length() > 0 && clean.charAt(clean.length()-1) != ' ')
            {
                clean.append(current_char);


            }
        }
           
           
       if(clean.charAt(clean.length()-1 ) == ' ')
         {
          clean.deleteCharAt(clean.length()-1);
         }


       int start=0;
       for(int j=0;j<clean.length();j++)
        {
            if(clean.charAt(j)== ' ')
            {
                
               int end=j-1;
                reverse(clean,start,end);
                start=j+1;
                

            }

            else if(j==clean.length()-1)
            {
               int end=j;
                reverse(clean,start,end);
            }
             
            
        }

        return clean.toString();
    }

            
        

   private  void reverse(StringBuilder sb, int i, int j)
         {
            while(i<j)
            {

             char temp=sb.charAt(i);
             sb.setCharAt(i,sb.charAt(j));
             sb.setCharAt(j,temp);
             i++;
             j--;
            }
        }

            

}   
    