// BASIC CONCEPT OF THE LINKED-LIST
package LinkedList;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Node start = new Node(11);
        // Using next with the start value to get the next data
        start.next = new Node(22);
        // Using next.next to get the next of the next value to get the data
        start.next.next = new Node(33);
        start.next.next.next = new Node(34);
        start.next.next.next.next = new Node(44);
        System.out.println(start.data); // Data :11
        System.out.println(start.next.data);//Data :22
        System.out.println(start.next.next.data);//Data :33
        System.out.println(start.next.next.next.data);//Data :34
        System.out.println(start.next.next.next.next.data);// Data :44

    }
}
