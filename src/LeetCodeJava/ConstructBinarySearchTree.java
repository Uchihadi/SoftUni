package LeetCodeJava;

import javax.swing.tree.TreeNode;
import java.util.Enumeration;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class ConstructBinarySearchTree {
    public TreeNode BSTFromPreorder(int[] preorder) {
        // BSTFromPreorder takes in an array of Integers as Input, representing preorder traversal of BST
        return helper (preorder, 0, preorder.length - 1);
        // It calls helper function 'helper' --> recursive function that constructs the BST
        // 'helper' function takes in 3 arguments, the preorder array, lower bound and an upper bound
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
