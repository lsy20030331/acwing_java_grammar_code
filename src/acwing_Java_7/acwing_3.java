package acwing_Java_7;

public class acwing_3 {
    public static void main(String[] args) {}

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){ val = x; }
    }

    class Solution {
        public int[] printListReversingly(ListNode head) {
            int count = 0;
            for(ListNode cur = head; cur != null; cur = cur.next) {
                count++;
            }

            int[] res = new int[count];
            for(ListNode cur = head; cur != null; cur = cur.next) {
                res[--count] = cur.val;
            }
            return res;
        }
    }
}
