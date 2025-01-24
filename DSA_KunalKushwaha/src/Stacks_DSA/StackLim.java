package Stacks_DSA;

public class StackLim {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class stackkk {
        public static Node head;
        private int size;

        public static boolean isEmpty() {
            return head == null;
        }

        public void push(int val) {
            Node newNode = new Node(val);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public int size() {
            return size;
        }
    }
    public static void main(String[] args) {
        stackkk s = new stackkk();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);

       while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
       }
        }
    }

