class Solution {
    public List<List<Integer>> permute(int[] nums) {
        

        List<List<Integer>> result = new ArrayList<>();

        helper(nums, result, 0);

        return result;
    }

    public static void helper(int[] arr, List<List<Integer>> result, int indx){
        if(indx == arr.length){
            List<Integer> list = new ArrayList<>();
            for(int x: arr){
                list.add(x);
            }
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=indx; i<arr.length; i++){
            swap(indx, i, arr);
            helper(arr, result, indx+1);
            swap(indx, i, arr);
        }
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
