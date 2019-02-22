package binary_tree_zigzag_level_order_traversal;

import java.util.*;

public class Main {
}


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> ll = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                if (t != null) {
                    ll.add(t.val);
                    if (t.left != null) queue.offer(t.left);
                    if (t.right != null) queue.offer(t.right);
                }
            }
            list.add(ll);
        }
        Collections.reverse(list);
        return list;
    }
}