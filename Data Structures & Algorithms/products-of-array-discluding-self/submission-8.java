class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int nonZeroProduct = 1;
        int sum = 0;
        int zeroCount = 0;
        boolean zeroPresent = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) {
                zeroPresent = true;
                zeroCount++;
                // continue;
            }else{
                product = product*nums[i];
                nonZeroProduct = nonZeroProduct*nums[i];
            }
            sum += nums[i];
        }

        if(zeroCount>1){
            return new int[nums.length];
        }
        // if(sum==0 && zeroCount==1){
        //     return new int[nums.length];
        // }

        int[] result = new int[nums.length];
        // System.out.println("product: "+product);
        for(int i=0; i<nums.length; i++){
            if(zeroCount==1 ) {
                
                if(nums[i]!=0){
                    result[i]= 0;
                    continue;
                }
                else{
                     result[i] = product;
                    continue;
                }
            }
            // System.out.println(result);
            // if(nums[i]==0 && zeroCount==1) {
            //     // int[] res = new int[nums.length];
            //     // res[i] = product;
            //     // return res;
            //     result[i] = product;
            //     continue;
            // }
            if(nums[i]!=0){
                result[i] = product/nums[i];
            }
        }

        return result;
    }
}  
