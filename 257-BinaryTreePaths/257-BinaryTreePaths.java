// Last updated: 9/14/2026, 1:24:08 PM
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        findPaths(root, "", result);
        return result;
    }

    private void findPaths(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }

        if (path.length() == 0) {
            path = String.valueOf(node.val);
        } else {
            path = path + "->" + node.val;
        }

        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        findPaths(node.left, path, result);
        findPaths(node.right, path, result);
    }
}