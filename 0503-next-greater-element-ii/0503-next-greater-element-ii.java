class Solution {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            while (st.size() > 0 && nums[st.peek()] <= nums[i % n]) {
                st.pop();
            }
            if (st.size() == 0) {
                ans[i % n] = -1;
                st.push(i % n);
            } else {
                ans[i % n] = nums[st.peek()];
                st.push(i % n);
            }
        }
        return ans;
    }
}
