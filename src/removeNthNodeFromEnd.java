import java.util.Stack;

public class removeNthNodeFromEnd {
    public ListNode removeNthFromEnd1(ListNode head, int n){
        Stack<ListNode> stack = new Stack<>();
        for(ListNode curr = head; curr != null; curr = curr.next){
            stack.push(curr);
        }
        ListNode after = null;
        ListNode prev;
        for(int i = 0; i< n-1; i++){
            after = stack.pop();
        }
        stack.pop();
        prev = stack.pop();
        prev.next = after;
        return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
