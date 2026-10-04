class Solution {
    public boolean canJump(int[] nums) {
        int t =  nums.length-1;
        if (t == 0) return true;
        int i=0;
        int next = 0;
        while(i<t){
            int currentMax = nums[i];
            if (currentMax == 0) return false;
            int furthest=Integer.MIN_VALUE;
            int step = 0;
            for(int j=1; j<=currentMax; j++){
                step = j;
                if(i+step>=t) return true;
                int boundary = nums[i+step];
                if(boundary+i+step>furthest){
                    furthest = boundary+i+step;
                    next = i+step;
                }
            }
            i=next; 
        }

        return false;
    }
}
