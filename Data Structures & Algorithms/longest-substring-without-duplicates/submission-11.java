class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        int max = 0;

        for(int i=0; i<size; i++){
            int[] hash  = new int[256];
            StringBuilder substring = new StringBuilder();
            for( int j=i; j<size; j++){
                if( hash[Integer.valueOf(s.charAt(j))] == 1) break;
                substring.append(s.charAt(j));
                hash[Integer.valueOf(s.charAt(j))] = 1;
            }
            int len = substring.length();
            if(len>max) max = len;
        }

        return max;
    }
}
