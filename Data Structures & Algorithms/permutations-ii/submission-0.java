class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        helper(nums, result, 0);

        return result;
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void helper(
        int[] arr,
        List<List<Integer>> result,
        int indx
    ) {

        if (indx == arr.length) {
            List<Integer> list = new ArrayList<>();

            for (int x : arr) {
                list.add(x);
            }

            result.add(list);
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = indx; i < arr.length; i++) {

            // Avoid choosing the same value twice
            // for the current position.
            if (set.contains(arr[i])) {
                continue;
            }

            set.add(arr[i]);

            swap(indx, i, arr);

            helper(arr, result, indx + 1);

            swap(indx, i, arr);
        }
    }
}