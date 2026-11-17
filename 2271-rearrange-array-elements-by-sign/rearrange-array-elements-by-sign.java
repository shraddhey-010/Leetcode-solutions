class Solution {
    public int[] rearrangeArray(int[] nums){
        int [] result = new int[nums.length];
        int positive_index =0;
        int negative_index =1;
        for(int num : nums){
            if(num > 0){
                result[positive_index] = num;
                positive_index+=2;
            }else{
                result[negative_index] = num;
                negative_index+=2;
            }
        }return result;
    }
}