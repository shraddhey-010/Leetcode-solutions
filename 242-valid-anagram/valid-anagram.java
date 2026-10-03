class Solution {
    public boolean isAnagram(String s, String t) {
           char [] a =s.toCharArray();
           char [] b =t.toCharArray();
 
 
    if(a.length!=b.length)
    {
        return false;
    }

    int [] frequency_array=new int[26];
    for(int i=0;i<a.length;i++)
    {
        frequency_array[a[i]-97]++;
        frequency_array[b[i]-97]--;


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