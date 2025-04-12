class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        //         int i = 0;
        //         int ans = -1;
        //         int j = matrix[0].length - 1;
        //         while (i < matrix.length && j>=0) {
        //             if (matrix[i][j] > target) {
        //                j--;
        //             } else if (matrix[i][j] <target) {

        //                 i++;
        //             }else{
        // return true;
        //             }

        //         }

        //         return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int s = 0;
        int e = m * n - 1;
        while (s <= e) {
            int mid = e + (s - e) / 2;
            if (matrix[mid / n][mid % n] > target) {
                e = mid - 1;
            } else if (matrix[mid / n][mid % n] < target) {
                s = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
