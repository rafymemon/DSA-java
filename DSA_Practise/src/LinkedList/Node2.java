// Upgraded version of Node1
package LinkedList;

public class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Node2 start = new Node2(11);
        Node2 p = start;
        for (int i = 0; i < 4; i++) {
            p.next = new Node2(22 + 11 * i);
            p = p.next;
        }
        p = start;
        /*
         * for (int i = 0; i <5; i++) {
         * / System.out.println(p.data);
         * /p = p.next;
         * }
         */

        for (Node2 q = start; q != null; q = q.next) {
            System.out.println(q.data);
        
        }
    }

}
