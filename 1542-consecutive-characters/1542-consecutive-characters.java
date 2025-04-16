class Solution {

    public int maxPower(String s) {
        int c = 1;
        int max = 1;
        if(s.length()==1){
            return 1;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                c++;
            } else {
                max = Math.max(c, max);
                c = 1;
            }
        }
         max = Math.max(c, max);

        return max;
    }
}
