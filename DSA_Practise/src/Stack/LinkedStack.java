package Stack;
// Compare two stacks either they are equal or not
public class LinkedStack implements stack {
    private Node top;
    private int size;

    private static class Node {
        Object object;
        Node next;

        Node(Object obj, Node n) {
            this.object = obj;
            this.next = n;
        }
    } // Closing of Node class

    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.object;
    }

    @Override
    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        Object temp = top.object;
        top = top.next;
        --size;
        return temp;
    }

    @Override
    public void push(Object o) {
        top = new Node(o, top);
        ++size;
    }

    @Override
    public int size() {
        return size;
    }


}
