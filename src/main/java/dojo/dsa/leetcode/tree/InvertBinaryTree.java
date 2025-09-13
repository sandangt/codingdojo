package dojo.dsa.leetcode.tree;


public class InvertBinaryTree {
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

    static TreeNode solution(TreeNode root) {
        return invertTree(root);
    }
    static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
