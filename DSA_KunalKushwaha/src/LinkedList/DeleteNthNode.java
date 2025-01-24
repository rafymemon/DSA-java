package LinkedList;

public class DeleteNthNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node DeleteNth(Node head, int n) {
        if (head.next == null) {
            return null;
        }
        int size = 0;
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
            size++;
        }
        if (size == n) {
            return head.next;
        }
        Node prev = head;
        int indexToSearch = size - n;
        int i = 0;
        while (i < indexToSearch) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }

}
