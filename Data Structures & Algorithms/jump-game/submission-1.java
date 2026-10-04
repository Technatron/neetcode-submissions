class Solution {
    public boolean canJump(int[] nums) {
        int s = nums.length;
        if(s==0) return false;
        if(s==1) return true;

        int max = 0;
        for(int  i=0; i<s; i++){
            if(i>max) return false;
            int currentStep = nums[i];
            int reach = i+currentStep;
            max = Math.max(max, reach);
            if(reach>=s-1) return true;
        }
        return false;
    }
}
