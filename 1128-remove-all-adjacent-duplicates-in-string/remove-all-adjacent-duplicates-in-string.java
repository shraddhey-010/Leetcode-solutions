class Solution {
    public String removeDuplicates(String s) {
        char [] arr = new char[s.length()];
         int arr_index=0;
        for(int i=0;i<s.length();i++)
        {    char character =s.charAt(i);
            if(arr_index>0 && arr[arr_index-1]==character)
            {
                arr_index--;
            }
            else
            {
                arr[arr_index]=character;
                arr_index++;
            }
        }
        return new String(arr,0,arr_index);

        
    }
}