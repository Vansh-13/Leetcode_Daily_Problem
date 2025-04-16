class Solution {

    public boolean asteroidsDestroyed(int m, int[] as) {
        Arrays.sort(as);
        long mass=m;
        for (int i = 0; i < as.length; i++) {
            if (mass >= as[i]) {
                mass += as[i];
            } else {
                return false;
            }
        }
        return true;
    }
}
