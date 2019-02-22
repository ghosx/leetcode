package removeNthFromEnd;

public class Main {
    public static void main(String[] args) {

    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode bef = head;
        ListNode aft = head;
        for (int i = 0; i < n; i++) {
            bef = bef.next;
        }
        //链表的长度刚好是n,即删除头节点
        if (bef == null) {
            return head.next;
        }
        while (bef.next != null) {
            bef = bef.next;
            aft = aft.next;
        }
        aft.next = aft.next.next;
        return head;

    }
}