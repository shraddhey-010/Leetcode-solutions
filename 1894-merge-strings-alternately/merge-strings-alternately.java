class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb= new StringBuilder();
        int range =word1.length();
        if(word1.length()>word2.length())
        {
            range=word1.length();
        }
        else if(word1.length()<word2.length())
        {
            range=word2.length();
        }
        
        for(int i=0;i<range;i++)
        {
          if(word1.length()>word2.length() && i>=word2.length())
          {
            sb.append(word1.charAt(i));
          }
          else if(word1.length()<word2.length() && i>=word1.length())
          {
            sb.append(word2.charAt(i));
          }
          else
          {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
          }

        }
        return sb.toString();


    }
}