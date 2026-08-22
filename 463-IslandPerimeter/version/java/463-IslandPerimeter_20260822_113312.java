// Last updated: 8/22/2026, 11:33:12 AM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int rows = grid.length;
4        int cols = grid[0].length;
5        int perimeter = 0;
6
7        for (int i = 0; i < rows; i++) {
8            for (int j = 0; j < cols; j++) {
9                if (grid[i][j] == 1) {
10                    perimeter += 4;
11
12                    // Check the cell below
13                    if (i + 1 < rows && grid[i + 1][j] == 1) {
14                        perimeter -= 2;
15                    }
16
17                    // Check the cell to the right
18                    if (j + 1 < cols && grid[i][j + 1] == 1) {
19                        perimeter -= 2;
20                    }
21                }
22            }
23        }
24
25        return perimeter;
26    }
27}