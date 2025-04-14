class Solution {

    public int trap(int[] height) {
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        int lmax = height[0];
        for (int i = 1; i < leftmax.length; i++) {
            lmax = Math.max(height[i], lmax);
            leftmax[i] = lmax;
        }
        lmax = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            lmax = Math.max(height[i], lmax);
            rightmax[i] = lmax;
        }
        for (int i = 0; i < leftmax.length; i++) {
            System.out.print(rightmax[i] + " ");
        }
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            int a = leftmax[i];
            int b = rightmax[i];
            int c = Math.min(a, b);
            ans += c - height[i];
        }
        return ans;
    }
}
