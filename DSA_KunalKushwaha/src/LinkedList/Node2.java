package LinkedList;

public class Node2 {
    public static void main(String[] args) {
    Node2 n = new Node2(12);
    n.insertFirst(13);
    n.insertFirst(233);
    n.insertFirst(1);
    n.insertFirst(43);
    insertLast(n,98);



    }
    Node2 next;
    int data;
    Node2 tail;
    int size;


    Node2(int data) {
    this.data = data;
    }
    Node2(){

    }
    public static void insertLast(Node2 head,int value){
        Node2 temp = new Node2(value);
        Node2 t = head;
        while (t.next != null){
        t = t.next;
        }
        t.next = temp;

    }
    public void insertFirst(int data) {
        Node2 node = new Node2(data);
        Node2 head = new Node2();
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
            return;
        }
        size += 1;

    }


}
