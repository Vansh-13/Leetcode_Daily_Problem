class Pair {
    int a;
    int b;

    Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class MinStack {
    Stack<Pair> st = new Stack<>();

    public MinStack() {}

    public void push(int val) {
        if (st.size() == 0) {
            st.push(new Pair(val, val));
       
        } else {
            int cmin = Math.min(val, st.peek().b);
            st.push(new Pair(val, cmin));
        }
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().a;
    }

    public int getMin() {
        return st.peek().b;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
