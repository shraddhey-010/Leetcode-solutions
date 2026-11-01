class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max_area = 0;
        
        while (i < j) {
            int breadth = j - i;
            int height_min = Math.min(height[i], height[j]);
            int new_area = breadth * height_min;
            
            max_area = Math.max(max_area, new_area);
            
            if (height[i] < height[j]) {
                i++; 
            } else {
                j--; 
            }
        }
        
        return max_area;
    }
}