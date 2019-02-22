package isPalindrome;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l2.next = null;
        l1.next = l2;
        Boolean b = (new Solution()).isPalindrome(l1);
        System.out.println(b);
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Integer[] integers = new Integer[list.size()];
        list.toArray(integers);
        for (int i = 0; i < integers.length; i++) {
            if (!integers[i].equals(integers[integers.length - i - 1])) {
                return false;
            }
        }
        return true;
    }
}