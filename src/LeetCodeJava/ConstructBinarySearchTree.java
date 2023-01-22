package LeetCodeJava;

import javax.swing.tree.TreeNode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class ConstructBinarySearchTree {
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
