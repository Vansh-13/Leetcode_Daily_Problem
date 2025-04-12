class Solution {

    public int[] searchRange(int[] nums, int target) {
        int a1 = -1;
        boolean ans = false;
        int b1 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (ans==false && nums[i] == target) {
                a1 = i;
                ans = true;
                
            }
            if (nums[i] == target) {
                if (ans == true) {
                    b1 = i;
                }
            }
        }
        return new int[] { a1, b1 };
    }
}
