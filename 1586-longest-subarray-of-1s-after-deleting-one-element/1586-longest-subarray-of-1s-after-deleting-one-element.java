class Solution {

    public int longestSubarray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int c = 0;
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                c++;
            }
            while (c > 1) {
                if (nums[i] == 0) {
                    c--;
                }
                i++;
            }

            ans = Math.max(j - i, ans);
            j++;
        }
        return ans;
    }
}
