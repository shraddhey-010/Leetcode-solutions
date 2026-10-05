class Solution {
    public String defangIPaddr(String address) {


        StringBuilder sb = new StringBuilder(address);
        StringBuilder clean= new StringBuilder();

        for(int i=0;i<sb.length();i++)
        {
            if(i==sb.length()-1)
            {
                clean.append(sb.charAt(i));
            }
            else if(sb.charAt(i)!= '.' && sb.charAt(i+1)=='.')
            {
                clean.append(sb.charAt(i));
                clean.append('[');
                clean.append(sb.charAt(i+1));
                clean.append(']');
                i=i+1;
            }
            else if(sb.charAt(i) != '.' && sb.charAt(i+1) != '.')
            {
                clean.append(sb.charAt(i));
                
            }
        }
        return clean.toString();

        
    }
}