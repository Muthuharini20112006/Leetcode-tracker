// Last updated: 9/14/2026, 1:16:08 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        long maxDiagonalSq = 0;

        for (int[] d : dimensions) {
            int l = d[0];
            int w = d[1];

            long diagonalSq = 1L * l * l + 1L * w * w;
            int area = l * w;

            if (diagonalSq > maxDiagonalSq) {
                maxDiagonalSq = diagonalSq;
                maxArea = area;
            } else if (diagonalSq == maxDiagonalSq) {
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}