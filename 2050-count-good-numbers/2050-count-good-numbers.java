class Solution {
    static int mod = 1000000007;

    public int count(long a, long b) {
        if (b == 0) {
            return 1;
        }
        long ans = count(a, b / 2);
        long ans2 = (ans * ans) % mod;
        if (b % 2 == 1) {
            ans2 = (ans2 * a) % mod;
        }
        return (int) ans2;
    }

    public int countGoodNumbers(long n) {
        int a=  (int) count(5, (n + 1) / 2);
        int b=  (int)count(4, n / 2);
      return (int)(((long) a * b) % mod);
    }
}
