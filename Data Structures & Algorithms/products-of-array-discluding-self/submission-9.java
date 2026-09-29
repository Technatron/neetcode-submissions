class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0) return new int[]{};
        int product = 1;
        int nonZeroProduct = 1;
        int sum = 0;
        int zeroCount = 0;
        boolean zeroPresent = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) {
                zeroPresent = true;
                zeroCount++;
            }else{
                product = product*nums[i];
                nonZeroProduct = nonZeroProduct*nums[i];
            }
            sum += nums[i];
        }

        if(zeroCount>1){
            return new int[nums.length];
        }


        int[] result = new int[nums.length];
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
  
            if(nums[i]!=0){
                result[i] = product/nums[i];
            }
        }

        return result;
    }
}  
