package acwing_Java_7;

public class acwing_1 {
    public static void main(String[] args) {

    }

    public class ListNode_ {
        int val;
        ListNode_ next;
        ListNode_(int x) { val = x; }
    }

    class Solution {
        public void deleteNode(ListNode_ node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}

bm667
