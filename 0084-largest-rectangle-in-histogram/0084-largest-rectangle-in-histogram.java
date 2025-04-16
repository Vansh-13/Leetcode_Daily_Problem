class Solution {

    public int largestRectangleArea(int[] h) {
        int n = h.length;
        int[] next = new int[h.length];
        int[] pre = new int[h.length];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (st.size() > 0 && h[st.peek()] >=h[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                next[i] = n;
            } else {
                next[i] = st.peek();
            }
            st.push(i);
        }
        st = new Stack<>();
        for (int i = 0; i < pre.length; i++) {
            while (st.size() > 0 && h[st.peek()] >=h[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                pre[i] = -1;
            } else {
                pre[i] = st.peek();
            }
            st.push(i);
        }
        int max = 0;
        for (int i = 0; i < h.length; i++) {
            int area = (next[i] - pre[i]-1) * h[i];
            max = Math.max(area, max);
        }
        return max;
    }
}
