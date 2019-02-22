package n_ary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> ll = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node n = queue.poll();
                if (n != null) {
                    ll.add(n.val);
                    for (Node no : n.children
                    ) {
                        queue.offer(no);
                    }
                }
            }
            list.add(ll);
        }
        return list;
    }
}