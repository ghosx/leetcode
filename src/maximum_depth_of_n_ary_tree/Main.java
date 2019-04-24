package maximum_depth_of_n_ary_tree;

import java.util.List;

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
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int depth = -1;
        for (Node n : root.children
        ) {
            int t = maxDepth(n);
            if (t >= depth) depth = t;
        }
        return depth + 1;
    }
}