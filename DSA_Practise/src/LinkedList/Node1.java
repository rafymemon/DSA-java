//Upgraded version of Node class
package LinkedList;

public class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Node1 start = new Node1(11);
        // Using next with the start value to get the next data
        Node1 p = start;
        p.next = new Node1(22);
        p = p.next;
        p.next = new Node1(33);
        p = p.next;
        p.next = new Node1(34);
        p = p.next;
        p.next = new Node1(44);
        System.out.println(start.data); // Data :11
        System.out.println(start.next.data);//Data :22
        System.out.println(start.next.next.data);//Data :33
        System.out.println(start.next.next.next.data);//Data :34
        System.out.println(start.next.next.next.next.data);
    }
}
