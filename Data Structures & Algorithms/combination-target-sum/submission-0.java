class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> result = new ArrayList<>();


        helper(nums, target, 0, nums.length, new ArrayList<>(), result);

        return result;
    }

    public void helper(int[] arr, int t, int i, int len, List<Integer> ans, List<List<Integer>> result){

        if(i==len){
            if(t==0){
                result.add(new ArrayList(ans));
            }
            return;
        }

        if(arr[i]<=t){
            ans.add(arr[i]);
            helper(arr, t-arr[i], i, len, ans, result);
            ans.removeLast();
        }
        helper(arr, t, i+1, len, ans, result);
        
    }
}
