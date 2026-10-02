class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int s = nums.length;
        
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> triplets = new HashSet<>();
        for(int i=0; i<s; i++){

            Set<Integer> track = new HashSet<>();
            int j=i+1;
            while(j<s){
                int third = -(nums[i] + nums[j]);
                if(track.contains(third)){
                    ArrayList<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[j], third));
                    triplet.sort((a,b) -> a-b);
                    triplets.add(triplet);
                }
                track.add(nums[j]);
                j++;
            }
        }
        for( List<Integer> t: triplets ){
            list.add(t);
        }
    return list;

    }
}
