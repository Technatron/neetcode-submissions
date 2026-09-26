class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       if(nums.length==0) return new int[]{};
       if(nums.length == 1 && k==1) return nums;

       HashMap<Integer, Integer> map = new HashMap<>();

       for(int i=0; i<nums.length; i++){
        int ele = nums[i];

        map.put(ele, map.getOrDefault(ele,0)+1);
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
    int res[] = new int[k];
    for(int i=0; i<limit; i++){
        // list.add(keys.get(i));  
        // if(limit>=0){
        // }
        res[i] = keys.get(i);
    }
    

    // return list.stream().mapToInt(Integer::intValue).toArray();
    return res;
    }
}
