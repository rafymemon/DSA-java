package Queue;

import java.nio.channels.IllegalSelectorException;  

public class LinkedQueue implements Queue {
    public static class Node {
        Object data;
        Node previous = this, next = this;

        public Node(Object data) {
            this.data = data;
        }

        public Node(Object d, Node p, Node n) {
            this.data = d;
            this.previous = p;
            this.next = n;
        }
    }

    private Node head = new Node(null);
    private int size;

    public Object first() {
        if (size == 0) {
            throw new IllegalStateException("Queue is Empty");
        }
        return head.next.data;
    }

    public void add(Object obj) {
        head.previous.next = new Node(obj, head.previous, head);
        head.previous = head.previous.next;
        ++size;
    }

    public Object remove() {
        if (size == 0) {
            throw new IllegalStateException("Queue is Empty");
        }
        Object temp = head.next.data;
        head.next = head.next.next;
        head.next.previous = head;
        --size;
        return temp;
    }

    public int size() {
        if (size == 0) {
            throw new IllegalStateException("Queue is Empty");
        }
        return size;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }
        Node current = head.next;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        q.add("Sarmad");
        q.add("akber");
        q.add("birbal");
        System.out.println(q.size());

        for (int i = 1; i <= 3; i++) {
            System.out.println(q.first());
            q.remove();
        }

    }

}
