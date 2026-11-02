class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        helper(nums, result, set, 0, new ArrayList<>());

        return result;
    }

    public void helper(int[] arr, List<List<Integer>> result, Set<Integer> set, int i, List<Integer> ans){

        if(ans.size()== arr.length){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int j=0; j<arr.length; j++){
            if(!set.contains(arr[j])){
                ans.add(arr[j]);
                set.add(arr[j]);
                helper(arr, result, set, i+1, ans);
                ans.removeLast();
                set.remove(arr[j]);
            }
        }
    }
}
