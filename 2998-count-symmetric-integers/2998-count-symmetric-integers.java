class Solution {

    public int countSymmetricIntegers(int low, int high) {
        int c = 0;
        for (int i = low; i <= high; i++) {
            String s1 = String.valueOf(i);
            int len = s1.length();
            if (len % 2 != 0) continue;
            int mid = len / 2;
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < mid; j++) {
                int a = s1.charAt(j) - '0';
                sum1 += a;
            }
            for (int k = mid; k < len; k++) {
                int b = s1.charAt(k) - '0';
                sum2 += b;
            }
            if (sum1 == sum2) c++;
        }
        return c;
    }
}
