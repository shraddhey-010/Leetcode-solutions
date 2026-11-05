class Solution {
    public int maxVowels(String s, int k) {

       int count =0;int max_count=0;
        for(int i=0;i<k;i++)
        {
            char c= Character.toLowerCase(s.charAt(i));
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                count++;
            }
         }
         max_count=count;
         for(int j=k;j<s.length();j++)
         {
            char b= Character.toLowerCase(s.charAt(j));
            char a= Character.toLowerCase(s.charAt(j-k));
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            {
                count--;
            }
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
            {
                count++;
            }

            max_count=Math.max(max_count,count);


         }
         return max_count;
        
    }
}