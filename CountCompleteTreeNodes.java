import java.util.*;

public class CountCompleteTreeNodes {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static void main(String[] args) {
        /*
                 1
               /   \
              2     3
             / \   /
            4  5  6
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println("Total Nodes: " + countNodes(root));
    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = findHeightLeft(root);
        int rightHeight = findHeightRight(root);

        // If perfect complete subtree
        if (leftHeight == rightHeight)
            return (1 << leftHeight) - 1;  // same as 2^height - 1

        // Otherwise, count recursively
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private static int findHeightLeft(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    private static int findHeightRight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }
}
