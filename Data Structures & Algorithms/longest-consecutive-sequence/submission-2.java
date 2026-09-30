class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        Set<Integer> keys = map.keySet();

        for( int x: keys){
            if(map.get(x-1)==null){
                int streak = 0;
                int i=0;
                while(i<nums.length){
                   if(map.get(x+1)!=null){
                    streak++;
                    x++;
                    i++;
                   }else{
                    ans = Math.max(ans,streak);
                    break;
                   }
                }
            }
        }

        System.out.println(ans);


        return ans+1;
    }
}
