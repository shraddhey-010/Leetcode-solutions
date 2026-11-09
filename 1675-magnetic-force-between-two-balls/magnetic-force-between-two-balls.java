class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left=1;int right=position[position.length-1]-position[0];int ans=1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(valid_magnetic_force(position, mid, m))
            {   ans=mid;
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return ans;
        
    }
    private boolean valid_magnetic_force(int []position,int mid,int m)
    {   int last_pos_of_ball=position[0];
        int balls_placed=1;
        for(int i=1;i<position.length;i++)
        {  
           int diff=position[i]-last_pos_of_ball;
            if(diff>=mid)
            {  if(balls_placed < m)
                {
                 balls_placed++;
                }
            
              last_pos_of_ball=position[i];
            }
        }
       
       return balls_placed==m;
        
    }
}