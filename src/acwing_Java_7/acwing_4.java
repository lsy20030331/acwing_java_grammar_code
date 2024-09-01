package acwing_Java_7;

import java.util.List;

public class acwing_4 {
    public static void main(String[] args) {}

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){ val = x; }
    }

    class Solution {
        public ListNode deleteDuplicaiton(ListNode head) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode p = head;
            while(p.next != null) {
                ListNode q = p.next;
                while(q != null && q.val == p.next.val) {
                    q=q.next;
                }
                if(p.next.next != q) {
                    p.next = q;
                }else{
                    p = p.next;
                }
            }
            return dummy.next;
        }
    }
}
