// Last updated: 9/14/2026, 1:02:02 PM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4
5        int top = 0;
6        int bottom = n - 1;
7        int left = 0;
8        int right = n - 1;
9
10        int num = 1;
11
12        while (top <= bottom && left <= right) {
13
14            // left to right
15            for (int i = left; i <= right; i++) {
16                matrix[top][i] = num++;
17            }
18            top++;
19
20            // top to bottom
21            for (int i = top; i <= bottom; i++) {
22                matrix[i][right] = num++;
23            }
24            right--;
25
26            // right to left
27            for (int i = right; i >= left; i--) {
28                matrix[bottom][i] = num++;
29            }
30            bottom--;
31
32            // bottom to top
33            for (int i = bottom; i >= top; i--) {
34                matrix[i][left] = num++;
35            }
36            left++;
37        }
38
39        return matrix;
40    }
41}