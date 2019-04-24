package univalued_binary_tree;

public class Main {
    public static void main(String[] args) {
        System.out.println("hekko");
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if ((root == null) || (root.left == null && root.right == null)) return true;
        else if (root.left != null && root.right != null) {
            return (root.val == root.left.val) && (root.val == root.right.val) && isUnivalTree(root.left) && isUnivalTree(root.right);
        } else {
            return root.left == null ? (root.val == root.right.val && isUnivalTree(root.right)) : (root.val == root.left.val && isUnivalTree(root.left));
        }
    }
}