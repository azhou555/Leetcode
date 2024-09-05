public class swapNodesInPairs {
    public ListNode swapPairs(ListNode head){
        ListNode currNode = head;
        ListNode headStore = new ListNode(-1);
        headStore.next = head;
        ListNode prevNode = headStore;
        while(currNode != null && currNode.next != null){
            ListNode nextNode = currNode.next;
            currNode.next = nextNode.next;
            prevNode.next = nextNode;
            nextNode.next = currNode;
            prevNode = currNode;
            currNode = currNode.next;
        }
        return headStore.next;
    }
}
