class Solution {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int co = 0;
        for (int i = 0; i <=arr.length-3; i++) {
            for (int j = i + 1; j <=arr.length-2; j++) {
                if(Math.abs(arr[i]-arr[j])<=a){
                for (int k = j + 1; k <=arr.length-1; k++) {
                    int x = arr[i];
                    int y = arr[j];
                    int z = arr[k];
                    if ( Math.abs(y - z) <= b && Math.abs(x - z) <= c) {
                        co++;
                    }
                }
                }
            }
        }
        return co;
    }                                                                                          
}
