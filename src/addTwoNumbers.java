public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(4);
        d.next = e;
        e.next = f;
        ListNode res = addTwoNumbers(a, d);
        while (res.next != null) {
            System.out.print(res.val + ", ");
            res = res.next;
        }
        System.out.print(res.val);
    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        int n1 = 0;
        int n2 = 0;
        int i = 0;
        int j = 0;
        while (l1.next != null) {
            n1 += l1.val * Math.pow(10, i++);
            l1 = l1.next;
        }
        n1 += l1.val * Math.pow(10, i);
        while (l2.next != null) {
            n2 += l2.val * Math.pow(10, j++);
            l2 = l2.next;
        }
        n2 += l2.val * Math.pow(10, j);
        int sum = n1 + n2;
        int c = 1;
        ListNode start = new ListNode(sum % 10);
        ListNode curr = start;
        sum -= sum % 10;
        while (sum >= 10 * c) {
            int temp = (int) ((sum % (Math.pow(10, c + 1))) / (Math.pow(10, c)));
            System.out.println(temp + ", " + sum);
            curr.next = new ListNode(temp);
            curr = curr.next;
            sum -= temp * Math.pow(10, c);
            c++;
        }
        return start;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean first = true;
        ListNode start = new ListNode((l1.val + l2.val) % 10);
        ListNode next = new ListNode(0);
        int overflow = (l1.val + l2.val) / 10;
        while (!(l1.next == null && l2.next == null)) {
            int n1 = l1.next == null ? 0 : l1.next.val;
            l1 = l1.next == null ? l1 : l1.next;
            int n2 = l2.next == null ? 0 : l2.next.val;
            l2 = l2.next == null ? l2 : l2.next;
            int tot = overflow + n1 + n2;
            overflow = tot / 10;
            if (first == true) {
                start.next = new ListNode(tot % 10);
                next = start.next;
                first = false;
            } else {
                next.next = new ListNode(tot % 10);
                next = next.next;
            }
        }
        return start;
    }
}