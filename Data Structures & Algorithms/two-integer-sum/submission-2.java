class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if( nums.length <=1  ) return new int[1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int other = target - nums[i];
            if(map.get(other) != null){
                return new int[]{map.get(other), i};
            }
            map.put(nums[i], i);
        }

        return new int[2];
    }
}
