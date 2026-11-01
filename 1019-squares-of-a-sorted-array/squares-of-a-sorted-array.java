class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0; 
        int j = nums.length - 1;
        int[] arr = new int[nums.length];
        int end = arr.length - 1;
        
        while (i <= j) { 
            int a = nums[i] * nums[i]; 
            int b = nums[j] * nums[j];
            
            if (a > b) {
                arr[end--] = a;
                i++;
            } else {
                arr[end--] = b;
                j--;
            }
        }
        return arr;
    }
}