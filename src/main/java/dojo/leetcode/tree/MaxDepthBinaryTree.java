package dojo.leetcode.tree;

public class MaxDepthBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static int solution(TreeNode root) {
        return maxDepth(root, 0);
    }
    static int maxDepth(TreeNode root, int depth) {
        if (root == null) return depth;
        int leftDepth = maxDepth(root.left, depth + 1);
        int rightDepth = maxDepth(root.right, depth + 1);
        return Math.max(leftDepth, rightDepth);
    }
}
