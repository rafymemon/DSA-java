//
//package LinkedList;
//
//public class Node {
//    public static void main(String[] args) {
//        Node n = new Node();
//        n.insertFirst(12);
//        n.insertFirst(33);
//        n.insertFirst(50);
//        n.insertFirst(10);
//        n.insertFirst(1);
//        n.insertFirst(3);
//        n.insertLast(98);
//        n.insert(100, 3);
//        n.display();
//        n.deleteLast();
//        n.display();
//        n.get(1);
//    }
//
//    Node head;
//    Node tail;
//    int data;
//    Node next;
//    int size;
//
//    Node() {
//
//    }
//
//    Node(int data) {
//        this.data = data;
//    }
//
//    Node(int data, Node next) {
//        this.data = data;
//        this.next = next;
//    }
//
//    public void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + "-->");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    public int size(){
//        Node temp = head;
//        int count = 0;
//        while (temp!= null){
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }
//    public void insertFirst(int data) {
//        Node node = new Node(data);
//        node.next = head;
//        head = node;
//        if (tail == null) {
//            tail = head;
//            return;
//        }
//        size += 1;
//
//    }
//
//    public void insertLast(int data) {
//        Node node = new Node(data);
//        tail.next = node;
//        tail = node;
//        if (tail == null) {
//            insertFirst(data);
//            return;
//        }
//        tail.next = node;
//        tail = node;
//        size++;
//
//    }
//    public void insert(int value, int index){
//        if (index==0) {
//            insertFirst(value);
//            return;
//        }
//        if (index == size) {
//            insertLast(value);
//            return;
//        }
//        Node temp = head;
//        for(int i=1; i<index; i++){
//            temp = temp.next;
//        }
//        Node addN = new Node(value,temp.next);
//        temp.next = addN;
//        size++;
//
//    }
//    public int deleteFirst(){
//        int value = head.data;
//        head = head.next;
//        if (head == null){
//            tail = null;
//        }
//        size --;
//        return value;
//    }
//    public int deleteLast(){
//        if (size<= 1){
//            return deleteFirst();
////        }
////        Node secondLast = get((size - 2));
////        int value = tail.data;
////        tail = secondLast;
////        tail.next = null;
////        return value;
////    }
//    public int get(int index){
//        Node node = head;
//        if(index <0 || index>size()){
//            System.out.println("Invalid input");
//            return -1;
//        }
//        for(int i = 0; i <index ; i++) {
//           node = node.next;
//        }
//    return -1;
//    }
//
//
//}
