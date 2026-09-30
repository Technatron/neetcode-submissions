class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result  = new int[nums.length];
        int[] suffix = new int[nums.length];
        int p =1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                suffix[i] = p;
                // suffix[i] = p/nums[i];
                p=p*nums[i];
            }
            else{
                suffix[i] = p;
                p=p*nums[i];
            }
        }
        // printArray(suffix);

        int p2=1;
        int[] prefix = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]!=0){
                prefix[i] = p2;
                p2 = p2*nums[i];
                // prefix[i] = p2/nums[i];
            }
            if(nums[i]==0){
                prefix[i] = p2;
                p2 = p2*nums[i];
            }
            result[i] = suffix[i]*prefix[i];
        }
        // printArray(prefix);

        return result;
    }

    public void printArray(int[] nums){
            System.out.print("[ ");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
            System.out.print(" ] ");
    }
}  
