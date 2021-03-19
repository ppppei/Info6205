package assignment6;
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class q5 {
	public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            //if less than k, no need to reverse
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
       
        ListNode newHead = reverse(head, tail);
        //tail is the start of the first round
        head.next = reverseKGroup(tail, k);

        return newHead;
    }
    private ListNode reverse(ListNode head, ListNode tail) {
        ListNode pre = null;
        ListNode next = null;
        while (head != tail) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }
}
