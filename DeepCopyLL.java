class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class DeepCopyLL {
    public Node copyRandomList(Node head) {
        if (head == null) return head;

        Node curr = head;

        // Step 1: Insert cloned nodes between original nodes
        while (curr != null) {
            Node clone = new Node(curr.val);
            clone.next = curr.next;
            curr.next = clone;
            curr = clone.next;
        }

        // After Step 1: Interleaved list created
        curr = head;

        // Step 2: Assign random pointers for cloned nodes
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        // After Step 2: Random pointers assigned
        curr = head;
        Node cloneHead = new Node(0);
        Node copyCurr = cloneHead;

        // Step 3: Separate original and cloned lists
        while (curr != null) {
            Node clone = curr.next;
            copyCurr.next = clone;
            copyCurr = copyCurr.next;
            curr.next = clone.next;
            curr = curr.next;
        }

        // After Step 3: Both lists separated
        return cloneHead.next;
    }

    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.next = new Node(11);

        head.random = head.next.next; // 7.random -> 11
        head.next.random = head;      // 13.random -> 7

        DeepCopyLL obj = new DeepCopyLL();
        Node clonedHead = obj.copyRandomList(head);

        System.out.println("Original head: " + head.val);
        System.out.println("Cloned head: " + clonedHead.val);
    }
}
