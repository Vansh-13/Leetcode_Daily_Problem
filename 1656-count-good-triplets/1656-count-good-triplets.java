class Solution {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int co = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int x = arr[i];
                    int y = arr[j];
                    int z = arr[k];
                    if (Math.abs(x - y) <= a && Math.abs(y - z) <= b && Math.abs(x - z) <= c) {
                        co++;
                    }
                }
            }
        }
        return co;
    }
}
