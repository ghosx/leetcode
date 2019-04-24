package add_two_numbers;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l2.val == 0) return new ListNode(0);
        Long one = 0L, two = 0L;
        Stack<Integer> stack = new Stack<>();
        while (l1 != null) {
            stack.push(l1.val);
            l1 = l1.next;
        }
        while (!stack.empty()) {
            one = one * 10 + stack.pop();
        }
        while (l2 != null) {
            stack.push(l2.val);
            l2 = l2.next;
        }
        while (!stack.empty()) {
            two = two * 10 + stack.pop();
        }
        long sum = one + two;

        int len = String.valueOf(sum).length();
        ListNode[] listNodes = new ListNode[len];
        int i = 0;
        while (sum != 0) {
            listNodes[i++] = new ListNode((int) sum % 10);

            sum /= 10;
        }
        for (int j = 0; j < len - 1; j++) {
            listNodes[j].next = listNodes[j + 1];
        }
        return listNodes[0];

    }
}


