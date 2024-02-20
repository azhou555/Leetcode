public class palindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode root = null;
        int count = 0;
        for(ListNode marker = head; marker != null; marker = marker.next){
            root = new ListNode(marker.val, root);
            count++;
        }
        count /= 2;
        while(count >= 0){
            if(root.val != head.val)
                return false;
            else{
                root = root.next;
                head = head.next;
            }
            count--;
        }
        return true;
    }
}
