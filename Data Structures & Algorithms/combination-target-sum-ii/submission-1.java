class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(candidates);

        helper(candidates, target, 0, candidates.length, new ArrayList<>(), result);

        return new ArrayList<>(result);
    }

    public void helper(int[] arr, int target, int index, int len, List<Integer> ans, Set<List<Integer>> result){
        // if(index==len){
        //     if(target == 0){
        //         result.add(new ArrayList<>(ans));
        //         return;
        //     }
        // }
        if(target == 0){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i=index; i<len; i++){

            if(i!=index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            ans.add(arr[i]);
            helper(arr, target-arr[i], i+1, len, ans, result);
            ans.removeLast();
        }
    }
}
