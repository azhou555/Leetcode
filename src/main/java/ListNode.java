public class ListNode{
    int val;
    ListNode next;
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val; this.next = next;}
    @Override
    public String toString(){
        return String.valueOf(val);
    }
    public String toString(ListNode head){
        StringBuilder sb = new StringBuilder();
        for(ListNode curr = head; curr != null; curr = curr.next){
            sb.append(curr.val).append(" ");
        }
        return sb.toString();
    }
}