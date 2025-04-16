class Solution {

    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            int c = a[i];
            while (!st.isEmpty() && c < 0 && st.peek() > 0) {
                if (st.peek() == -c) {
                    st.pop();
                    c = 0;
                } else if (st.peek() < -c) {
                    st.pop();
                } else {
                    c = 0;
                    break;
                }
            }

            if (c != 0) {
                st.push(c); // ✅ fix yahi hai
            }
        }

        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
