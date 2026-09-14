// Last updated: 9/14/2026, 1:22:27 PM
class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;

                    // Check the cell below
                    if (i + 1 < rows && grid[i + 1][j] == 1) {
                        perimeter -= 2;
                    }

                    // Check the cell to the right
                    if (j + 1 < cols && grid[i][j + 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }
}