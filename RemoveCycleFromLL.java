public class RemoveCycleFromLL {
    static class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
            next = null;
        }
    }
    public static void remove(Node head){
        Node fast = head,slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }
        if( fast!= slow) return;
        slow = head;
        if(fast == slow){
            while(fast.next!= slow){
            fast = fast.next;
            }
        }
        else{
            while(fast.next != slow.next){
                fast = fast.next;
                slow = slow.next;
            }
        }
        fast.next = null;
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);
        head.next.next.next.next= new Node(5);
        head.next.next.next.next.next= new Node(6);
        head.next.next.next.next.next.next = head.next.next;

        //1->2->3->4->5->6->
        remove(head);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
    }
}