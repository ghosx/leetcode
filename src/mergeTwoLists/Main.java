package mergeTwoLists;

public class Main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(4);
        l1.next = l3;
        l3.next = l5;
        l2.next = l4;
        l4.next = l6;
        ListNode t = (new Solution()).mergeTwoLists(l1, l2);
        while (t != null) {
            System.out.print(t.val + " -> ");
            t = t.next;
        }

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode ll = new ListNode(l1.val < l2.val ? l1.val : l2.val);
        if ((l1.val < l2.val)) {
            l1 = l1.next;
        } else {
            l2 = l2.next;
        }
        ListNode head = ll;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ll.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                ll.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            ll = ll.next;
        }
        if (l1 != null) {
            ll.next = l1;
        }
        if (l2 != null) {
            ll.next = l2;
        }
        return head;
    }
}