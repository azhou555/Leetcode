public class removeLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        while (curr != null) {
            System.out.println(ListNode.toString(curr));
            if (curr.val == val) {
                if (curr.next == null) {
                    if (head.next == null) {
                        return null;
                    }
                    else {
                        ListNode marker = head;
                        while (marker.next.next != null) {
                            marker = marker.next;
                        }
                        marker.next = null;
                        break;
                    }
                } else {
                    curr.val = curr.next.val;
                    curr.next = curr.next.next;
                }
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
