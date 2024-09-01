package acwing_Java_7;

public class acwing_2 {
    public static void main(String[] args) {

    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){ val = x; }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode cur = head;
            while(cur != null){
                ListNode next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            return prev;
        }
    }
}
