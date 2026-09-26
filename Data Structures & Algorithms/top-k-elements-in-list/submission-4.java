class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       if(nums.length==0) return new int[]{};
    //    if(nums.length==1 && k!=1) return new int[]{};

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
    //    Set<Integer> keys = map.keySet();
    //    keys.forEach(key -> {
    //     if(map.get(key)>=k){
    //         list.add(key);
    //     }
    //    });

    //    Collections.sort();
    //    System.out.println(map);
    //    System.out.println("entry set: "+map.entrySet());

       Map<Integer, Integer>  sorted = map.entrySet()
                                            .stream()
                                            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed() )
                                            .collect(Collectors.toMap(
        Map.Entry::getKey, 
        Map.Entry::getValue, 
        (oldValue, newValue) -> oldValue, LinkedHashMap::new
    ));
    // System.out.println(sorted);

    // int[] keys = sorted.keySet().stream().mapToInt(Integer::intValue).toArray();
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
