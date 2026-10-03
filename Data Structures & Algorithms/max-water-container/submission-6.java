class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        if(heights.length<=1 || j-i==0) return 0;
        // if(heights.length==1) {
        //     return (j-1)*Math.min(heights[i], heights[j]);
        // }

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
