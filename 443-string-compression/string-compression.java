class Solution {
    public int compress(char[] chars) {
        int write=0;int read=0;
        while(read<chars.length)
        {
           int count=0;
            char current_char=chars[read];
            while(read<chars.length && chars[read]==current_char)
            {
                count++;
                read++;

            }
             chars[write++]=current_char;
            if(count>1)
            {

            
                
                String num = Integer.toString(count);
                 for(char character : num.toCharArray())
                     {
                         chars[write++] = character;
                     }
            }
             
        }
        return write;
        
    }
}