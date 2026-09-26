class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        Queue<Integer> queue = new PriorityQueue<>( (a,b) -> map.get(a)-map.get(b));
        
        for( int ele: map.keySet()){
            queue.add(ele);
            if(queue.size()>k){
                queue.poll();
            }
        }

        int result[] = new int[k];

        for( int i=0; i<k; i++){
            result[i] = queue.poll();
        }


        return result;
    }
}
