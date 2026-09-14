// Last updated: 9/14/2026, 1:37:45 PM
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
16class Solution {
17
18    int maxSum = Integer.MIN_VALUE;
19
20    public int maxPathSum(TreeNode root) {
21        findMax(root);
22        return maxSum;
23    }
24
25    public int findMax(TreeNode root) {
26
27        if (root == null) {
28            return 0;
29        }
30
31        // Ignore negative paths
32        int left = Math.max(0, findMax(root.left));
33        int right = Math.max(0, findMax(root.right));
34
35        // Path passing through current node
36        int current = root.val + left + right;
37
38        maxSum = Math.max(maxSum, current);
39
40        // Return one side to parent
41        return root.val + Math.max(left, right);
42    }
43}