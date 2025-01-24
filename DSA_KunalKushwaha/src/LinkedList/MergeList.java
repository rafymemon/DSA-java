package LinkedList;

public class MergeList {
    static  class Node{

        Node next;
        int data;

        public Node(int data){
            this.data = data;
        }

    }
    public static void main(String[] args) {
    Node t = new Node(1);

    }
    public static Node Merge(Node head){
        Node temp = head;
        int zeroCount = 0;
        int oneCount = 1;
        int twoCount = 2;
        while (temp!=null){
            if (temp.data == 0){
                oneCount++;
            } else if (temp.data == 1) {
                oneCount++;
            } else if (temp.data==2) {
                twoCount++;
            }
            temp = temp.next;
        }
        temp = head;
        while (temp!=null) {
            if (zeroCount !=0) {
                temp.data = 0;
                zeroCount--;
            }
            else if (oneCount != 0){
                temp.data = 1;
                oneCount--;
            }
            else if (twoCount !=0){
                temp.data = 2;
                twoCount--;
            }
            temp = temp.next;
        }
        return head;
    }

}
