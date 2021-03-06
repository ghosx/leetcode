package yanghuisanjiao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        list.add(l1);
        if (numRows == 1) {
            return list;
        }
        for (int i = 1; i < numRows; i++) {
            List<Integer> ll = new ArrayList<>();
            ll.add(1);
            for (int j = 1; j < i; j++) {
                int t = list.get(i - 1).get(j) + list.get(i - 1).get(j - 1);
                ll.add(t);
            }
            ll.add(1);
            list.add(ll);
        }
        return list;
    }
}
