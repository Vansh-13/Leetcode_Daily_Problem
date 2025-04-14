class Solution {
    public long maximumTripletValue(int[] nums) {
         int[] left = new int[nums.length];
         left[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            left[i] = Math.max(left[i - 1], nums[i - 1]);
        }
        int[] right = new int[nums.length];
        right[nums.length - 1] = 0;
        for (int j = nums.length - 2; j >= 0; j--) {
            right[j] = Math.max(right[j + 1], nums[j + 1]);
        }
        long ans3 = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            ans3 = Math.max(ans3, (long) (left[i] - nums[i]) * right[i]);
        }
        return ans3;
          
    }
}