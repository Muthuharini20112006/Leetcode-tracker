// Last updated: 9/14/2026, 1:40:13 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16import java.util.*;
17
18class Solution {
19
20    public List<List<Integer>> verticalTraversal(TreeNode root) {
21
22        List<int[]> nodes = new ArrayList<>();
23
24        dfs(root, 0, 0, nodes);
25
26        // Sort by column, then row, then value
27        Collections.sort(nodes, (a, b) -> {
28
29            if (a[1] != b[1]) {
30                return a[1] - b[1];
31            }
32
33            if (a[0] != b[0]) {
34                return a[0] - b[0];
35            }
36
37            return a[2] - b[2];
38        });
39
40        List<List<Integer>> result = new ArrayList<>();
41
42        int previousColumn = Integer.MIN_VALUE;
43
44        for (int[] node : nodes) {
45
46            int row = node[0];
47            int column = node[1];
48            int value = node[2];
49
50            if (column != previousColumn) {
51                result.add(new ArrayList<>());
52                previousColumn = column;
53            }
54
55            result.get(result.size() - 1).add(value);
56        }
57
58        return result;
59    }
60
61    private void dfs(TreeNode root, int row, int column,
62                     List<int[]> nodes) {
63
64        if (root == null) {
65            return;
66        }
67
68        nodes.add(new int[]{row, column, root.val});
69
70        dfs(root.left, row + 1, column - 1, nodes);
71
72        dfs(root.right, row + 1, column + 1, nodes);
73    }
74}