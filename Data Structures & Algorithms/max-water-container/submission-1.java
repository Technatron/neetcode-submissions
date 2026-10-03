class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;

        int ans = 0;
        while(i<j){
            int height = Math.min(heights[i], heights[j]);
            int width = j-i;
            int volume = height*width;
            ans = Math.max(volume, ans);

            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }

        return ans;
    }
}
