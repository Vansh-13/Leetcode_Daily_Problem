class Solution {

    public int findDuplicate(int[] nums) {
        int l = 0;
        int h = nums.length-1;
        while (l <=h) {
            int mid = h + (l - h) / 2;
            int c = 0;
            for (int num : nums) {
                if (num <= mid) {
                    c++;
                }
            }
            if (c > mid) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
