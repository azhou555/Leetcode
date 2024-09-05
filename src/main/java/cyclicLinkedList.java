import java.util.HashSet;

public class cyclicLinkedList {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow,fast;
        slow = fast = head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
