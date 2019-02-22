package isValidBST;

public class Main {
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
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if ((root.left == null || root.left.val >= root.val) || (root.right == null || root.right.val <= root.val)) {
            return false;
        } else {
            isValidBST(root.left);
            isValidBST(root.right);
            return true;
        }
    }
}