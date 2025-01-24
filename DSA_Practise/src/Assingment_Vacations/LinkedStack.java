package Assingment_Vacations;

public class LinkedStack implements Stack {

    private Node top;
    private int size;

    // inner class Node start
    private static class Node {
        Object object;
        Node next;
        public Object data;

        Node(Object obj, Node n) {
            object = obj;
            next = n;
        }
    } // Node class end

    public boolean isEmpty() {
        return (this.size == 0);
    }

    public int size() {
        return this.size;
    }

    public Object peek() {
        if (isEmpty())
            throw new IllegalStateException("Stack is Empty");

        return top.object;
    }

    public Object pop() {
        if (isEmpty())
            throw new IllegalStateException("Stack is Empty");

        Object temp = top.object;
        top = top.next;
        --size;
        return temp;
    }

    public void push(Object obj) {
        top = new Node(obj, top);
        size++;
    }

    public void printStack(LinkedStack linkedStack) {
        Node temp = linkedStack.top;
        while (temp != null) {
            System.out.println(temp.object);
            temp = temp.next;
        }
    }

    public LinkedStack reverseStack(LinkedStack linkedStack) {
        LinkedStack reversedStack = new LinkedStack();
        Node temp = linkedStack.top;
        while (temp != null) {
            reversedStack.push(temp.object);
            temp = temp.next;
        }
        return reversedStack;
    }

    public ArrayStack linkedStackToArrayStack(LinkedStack linkedStack) {
        ArrayStack arrayStack = new ArrayStack(linkedStack.size);
        LinkedStack reversedLinkedStack = linkedStack.reverseStack(linkedStack);
        while (!reversedLinkedStack.isEmpty()) {
            arrayStack.push(reversedLinkedStack.pop());
        }
        return arrayStack;
    }

    public LinkedStack arrayStackToLinkedStack(ArrayStack arrayStack) {
        LinkedStack linkedStack = new LinkedStack();
        ArrayStack reversedArrayStack = arrayStack.reverseArrayStack(arrayStack);
        while (!reversedArrayStack.isEmpty()) {
            linkedStack.push(reversedArrayStack.pop());
        }
        return linkedStack;
    }

    public Object searchByIndex(LinkedStack linkedStack, int index) {
        if (index < 0 || index > linkedStack.size)
            return null;
        int i = 0;
        for (Node temp = linkedStack.top; temp != null; temp = temp.next, i++) {
            if (i == index)
                return temp.object;
        }
        return null;
    }

    public boolean searchByElement(LinkedStack linkedStack, Object element) {
        Node temp = linkedStack.top;
        while (temp != null) {
            if (temp.object.equals(element))
                return true;
            temp = temp.next;
        }
        return false;
    }

    public LinkedStack duplicate(LinkedStack linkedStack) {
        LinkedStack duplicateStack = new LinkedStack();

        Node temp = linkedStack.top;
        while (temp != null) {
            duplicateStack.push(temp.object);
            temp = temp.next;
        }
        duplicateStack = duplicateStack.reverseStack(duplicateStack);
        return duplicateStack;
    }

    public LinkedStack mergeTwoStack(LinkedStack stack1, LinkedStack stack2) {
        if (stack1.isEmpty())
            return stack2;
        if (stack2.isEmpty())
            return stack1;

        LinkedStack mergedStack = new LinkedStack();
        LinkedStack reverseStack1 = stack1.reverseStack(stack1);
        LinkedStack reverseStack2 = stack2.reverseStack(stack2);

        while (!reverseStack1.isEmpty())
            mergedStack.push(reverseStack1.pop());

        while (!reverseStack2.isEmpty())
            mergedStack.push(reverseStack2.pop());

        return mergedStack;
    }

    public boolean compareStack(LinkedStack stack1, LinkedStack stack2) {
        Node tempStack1 = stack1.top;
        Node tempStack2 = stack2.top;
        while (tempStack1 != null || tempStack2 != null) {
            if (!tempStack1.object.equals(tempStack2.object))
                return false;

            tempStack1 = tempStack1.next;
            tempStack2 = tempStack2.next;
        }
        return true;
    }

    public boolean equalMethod(LinkedStack l1, LinkedStack l2) {
        if (l1.size() != l2.size()) {
            System.out.println("Size is not equal");
            return false;
        } else {

            Node temp1 = l1.top;
            Node temp2 = l2.top;
            boolean status = false;

            while (temp1 != null) {
                if (temp1.data != temp2.data) {
                    return false;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return true;
        }

        // linkedStackToArrayStack
        // ArrayStackToLinkedStack
        // reverseStack both arrayStack and LinkedStack
        // searchElement
        // mergeTwoLinkedStack
        // subStack
        // compareTwoStack : do comparison of Two Stack that the Data of both is same or
        // not
        // reverse polish Notation
        // to string method --> that returns the string data
        // remove the bottom element of the stack
        //

    }
}
