class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) == null ){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }

            if(map.get(nums[i])>1) return true;
        }

        // System.out.println(map);

        return false;
    }
}