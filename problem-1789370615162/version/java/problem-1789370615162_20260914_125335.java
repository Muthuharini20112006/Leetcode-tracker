// Last updated: 9/14/2026, 12:53:35 PM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> ans = new ArrayList<>();
4
5        int top = 0;
6        int bottom = matrix.length - 1;
7        int left = 0;
8        int right = matrix[0].length - 1;
9
10        while (top <= bottom && left <= right) {
11
12            
13            for (int i = left; i <= right; i++) {
14                ans.add(matrix[top][i]);
15            }
16            top++;
17
18          
19            for (int i = top; i <= bottom; i++) {
20                ans.add(matrix[i][right]);
21            }
22            right--;
23
24            if (top <= bottom) {
25                for (int i = right; i >= left; i--) {
26                    ans.add(matrix[bottom][i]);
27                }
28                bottom--;
29            }
30
31            if (left <= right) {
32                for (int i = bottom; i >= top; i--) {
33                    ans.add(matrix[i][left]);
34                }
35                left++;
36            }
37        }
38
39        return ans;
40    }
41}