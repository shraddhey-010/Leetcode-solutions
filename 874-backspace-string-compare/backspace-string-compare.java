
class Solution {
    public boolean backspaceCompare(String s, String t) {
       return backspace(s).equals(backspace(t));
    }
    private String backspace(String s)
    {
        StringBuilder sb = new StringBuilder();
        int j=0;
        int i=0;
        while(j<s.length())
        {
          if(s.charAt(j)!='#')
          {
             sb.append(s.charAt(j));
             i++;
          }
           else if(sb.length()!=0)
           {
             i--;
             sb.deleteCharAt(i);
           }
          j++;


        }
        return sb.toString();
    }
}
         