class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        for( int x: set){
            if(!set.contains(x-1)){
                int streak=1;
                int start =x;
                while(set.contains(start+1)){
                    start++;
                    streak++;
                    // if(set.contains(x+1)){
                    // }
                }
                ans = Math.max(ans, streak);
            }
           
        }


        return ans;
    }
}
