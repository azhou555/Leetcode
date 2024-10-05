public class oddEvenLinkedList {
    public ListNode oddEvenList(ListNode head){
        if(head.next == null || head.next.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode ehead = head;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd=odd.next;
            even= even.next;
        }
        odd.next = ehead;
        return head;
    }
}
