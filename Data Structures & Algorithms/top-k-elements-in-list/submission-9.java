class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       if(nums.length==0) return new int[]{};
    //    if(nums.length == k) return nums;

       HashMap<Integer, Integer> map = new HashMap<>();

       for(int i=0; i<nums.length; i++){
        int ele = nums[i];
        if(map.get(ele) == null ){
            map.put(ele, 0);
        }{
            map.put(ele, map.get(ele)+1);
        }
       }

       ArrayList<Integer> list = new ArrayList<>();
 

       Map<Integer, Integer>  sorted = map.entrySet()
                                            .stream()
                                            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed() )
                                            .collect(Collectors.toMap(
        Map.Entry::getKey, 
        Map.Entry::getValue, 
        (oldValue, newValue) -> oldValue, LinkedHashMap::new
    ));
    
    List<Integer> keys = sorted.keySet().stream().toList();
    System.out.println(keys);
    
    
    int limit = k;
    for(int i=0; i<limit; i++){
        if(limit>=0){
            list.add(keys.get(i));
        }
    }
    

    return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
