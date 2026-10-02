class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length==0) return ans;

        
        int s=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<s-2; i++){
            if(i>0 && nums[i]== nums[i-1]) continue;
            int j=i+1;
            int k = s-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum>0){
                    k--;
                }else if( sum<0){
                    j++;
                }
                else{
                    List<Integer> list = new ArrayList<>(Arrays.asList( nums[i], nums[j], nums[k]));
                    ans.add(list);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;

                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }


        return  ans;
    }
}
