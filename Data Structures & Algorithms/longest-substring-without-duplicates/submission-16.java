class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int l=0;
        int max=0;

        for(int i=0; i<s.length(); i++){
            int r=i;
            int len = 0;
            char current = s.charAt(r);
            if(map.get(current)== null){
                len = r-l+1;
                max = Math.max(len, max);
                map.put(current, r);
            }else if(map.get(current)<l){
                len = r-l+1;
                max = Math.max(len, max);
                map.put(current, r);
            }else if(map.get(current)>=l){
                l = map.get(current)+1;
                len = r-l+1;
                max = Math.max(len, max);
                map.put(current, r);
            }
            // else if(map.get(current)+1==r){
            //     l=r;
            //     len = r-l+1;
            //     max = Math.max(len, max);
            //     map.put(current, r);
            // }
        }


        return max;
    }
}
