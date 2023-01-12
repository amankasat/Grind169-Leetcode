import java.util.ArrayList;

public class LLCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        ArrayList<ListNode> list = new ArrayList<>();
        while (head.next != null) {
            if (list.contains(head))
                return true;
            list.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode fast= head;
        ListNode slow= head;
        while (fast!=null && fast.next!= null)
        {
            fast= fast.next.next;
            slow= slow.next;
            if (fast==slow)
            {
                return true;
            }
        }
        return false;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}