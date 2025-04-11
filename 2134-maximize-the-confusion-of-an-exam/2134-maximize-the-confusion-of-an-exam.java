class Solution {

    public int maxConsecutiveAnswers(String answer, int k) {
        int n = answer.length();
        int c = 0;
        int ans = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while (j < n) {
            if (answer.charAt(j) == 'F') {
                c++;
            }
            while (c > k) {
                if (answer.charAt(i) == 'F') {
                    c--;
                }
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        c=0;
        int ans2 = Integer.MIN_VALUE;
        i = 0;
        j = 0;
        while (j < n) {
            if (answer.charAt(j) == 'T') {
                c++;
            }
            while (c > k) {
                if (answer.charAt(i) == 'T') {
                    c--;
                }
                i++;
            }
            ans2 = Math.max(ans2, j - i + 1);
            j++;
        }
        return Math.max(ans, ans2);
    }
}
