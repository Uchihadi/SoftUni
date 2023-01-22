package LeetCodeJava;

import javax.swing.tree.TreeNode;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

// Given an array of Integers preorder, representing the preorder traversal of a Binary Search Tree,
// construct the tree and return its roots

public class ConstructBinarySearchTree {
    public TreeNode BSTFromPreorder(int[] preorder) {
        return helper (preorder, 0, preorder.length - 1);
    }

    private TreeNode helper (int[] preorder, int start, int end) {
        if (start > end) return null;

        TreeNode node = new TreeNode(preorder[start]);
        int i;
        for (i = start; i <= end; i++) {
            if (preorder[i] > node.val) break;
        }

        node.left = helper(preorder, start+1, i-1);
        node.right = helper(preorder, i, end);
        return node;
    }
}
