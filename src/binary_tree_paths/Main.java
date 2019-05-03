package binary_tree_paths;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<Integer, StringBuffer> map = new HashMap<>();
        StringBuffer s = new StringBuffer("hwllo");
        map.put(1, s);
        s.append("world");
        System.out.println(map.get(1));
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

//https://github.com/NjustJiaweihan/LeetCode/blob/master/Easy/257.java


class Solution {
    List<String> list;

    public List<String> binaryTreePaths(TreeNode root) {
        String s = "";
        dfs(root, s);
        for (String ss : list
        ) {
            System.out.println(ss);
        }
        return list;
    }

    public void dfs(TreeNode root, String s) {
        if (root == null) {
            list.add(s);
        } else {
            s += root.val;
            dfs(root.left, s);
            dfs(root.right, s);
        }
    }

}