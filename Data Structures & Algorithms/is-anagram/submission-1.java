class Solution {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            
            char c = s.charAt(i);
            if(map.get(c) == null){
                map.put(c, 1);
            }
            else{
                map.put(c, map.get(c)+1);
            }
        }

        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(map.get(c) != null && map.get(c)>0){
                map.put(c, map.get(c)-1);
            }
        }

        int sum = map.values().stream()
                    .reduce(0, (a,b) -> a+b);

        // System.out.println(map);
        // System.out.println(sum);

        if(sum==0) return true;

        return false;
    }
}
