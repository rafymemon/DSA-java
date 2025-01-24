package LinkedList;

public class Class {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        public static void main(String[] args) {
            Node head = new Node(22);
            Node temp = head;
            for (int i = 0; i < 4; i++) {
                temp = temp.next = new Node(33 + 11 * i);
            }
            // Using a loop to print a Linked List data
            for (Node p = head; p != null; p = p.next) {
                System.out.println(p.data);
            }
            for (Node p = head; p != null; p = p.next) {
                System.out.println(p);
            }
        }
    }

}
