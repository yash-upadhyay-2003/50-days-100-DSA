class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthFromEndLL {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        ListNode temp = head;
        int count = 1;

        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        if (count == n) {
            head = head.next;
            return head;
        }

        temp = head;
        n = count - n - 1;
        count = 0;

        while (temp != null) {
            if (count == n) {
                temp.next = temp.next.next;
                break;
            }
            count++;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; // Remove 2nd node from end

        head = removeNthFromEnd(head, n);

        // Print updated list
        System.out.print("Updated List: ");
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
