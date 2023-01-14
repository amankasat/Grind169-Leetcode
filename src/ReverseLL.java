public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null, cur = head;

        while(cur != null) {
            ListNode next = cur.next;
            cur.next = previous;
            previous = cur;
            cur = next;
        }
       return previous;
    }
}
