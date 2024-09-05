public class removeZeroSumConsecutiveListNodes {
    public ListNode removeZeroSumSublists(ListNode head){
        if(head == null){
            return head;
        }
        int sum = 0;
        for(ListNode curr = head; curr != null; curr = curr.next){
            sum += curr.val;
            if(sum == 0){
                head = curr.next;
            }
        }
        if(head != null){
            head.next = removeZeroSumSublists(head.next);
        }
        return head;
    }
}
