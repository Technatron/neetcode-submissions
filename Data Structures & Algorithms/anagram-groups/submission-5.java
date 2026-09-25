class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){

            String sorted = strs[i].chars()
                            .sorted()
                            .mapToObj( c-> String.valueOf((char) c))
                            .collect(Collectors.joining());
            
            // System.out.println(sorted);

            if(map.get(sorted) ==null){
                map.put(sorted, new ArrayList<String>());
                map.get(sorted).add(strs[i]);
            }else{
                // if(map.get(sorted) ==null){
                // map.put(sorted, new ArrayList<String>());
                // }
                // map.put(sorted, map.get(sorted).add(strs[i]));
                map.get(sorted).add(strs[i]);
                // System.out.println( map.get(sorted));
            }
        }

        // System.out.println(map);

        // ArrayList<String> list = new ArrayList<>();
        ArrayList<List<String>> list2 = new ArrayList<>();

        Set<String> set = map.keySet();
        set.forEach(key -> list2.add(map.get(key)));
        return list2;
    }
}
