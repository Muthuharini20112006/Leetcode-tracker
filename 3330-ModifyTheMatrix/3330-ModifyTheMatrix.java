// Last updated: 8/10/2026, 3:48:28 PM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Find maximum value in each column
        int[] colMax = new int[n];
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            colMax[j] = max;
        }

        // Replace -1 with column maximum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = colMax[j];
                }
            }
        }

        return matrix;
    }
}