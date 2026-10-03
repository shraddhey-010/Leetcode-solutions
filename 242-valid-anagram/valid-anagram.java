class Solution {
    public boolean isAnagram(String s, String t) {
    
    if(s.length()!=t.length())
    {
        return false;
    }

    int [] frequency_array=new int[26];
    for(int i=0;i<s.length();i++)
    {
        frequency_array[s.charAt(i)-97]++;
        frequency_array[t.charAt(i)-97]--;


    } 
    for(int j=0;j<frequency_array.length;j++)
    {
        if(frequency_array[j]!=0)
        {
            return false;
        }
    }
    return true;
   
}
}