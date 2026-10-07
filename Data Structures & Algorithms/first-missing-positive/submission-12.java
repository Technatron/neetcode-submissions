class Solution {
    public int firstMissingPositive(int[] nums) {
        int size = nums.length;

        for(int i=0; i<size; i++){
            // if(nums[i]<=0 || nums[i]>size) continue;
            int current = nums[i];
            if(current==i+1 || nums[i]<=0 || nums[i]>size){
                continue;
            }
            else{
                while(nums[i]!=i+1 && nums[i]<=size && nums[i]>0 ){
                    int curr = nums[i];
                    int targetIdx = curr-1;
                    if(nums[targetIdx] == nums[i]) break;
                    int targetEle = nums[targetIdx];
                    nums[targetIdx] = curr;
                    nums[i] = targetEle;
                }
            }
        }

        for(int i=0; i<size; i++){
            System.out.print(nums[i]+" ");
        }

        for(int i=0; i<size; i++){
            if(nums[i]!= i+1) return i+1;
        }

        return size+1;
    }
}