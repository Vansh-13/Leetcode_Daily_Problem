class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int w=j-i;
            int h=Math.min(height[i],height[j]);
            int ans=w*h;
            max=Math.max(max,ans);

            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}