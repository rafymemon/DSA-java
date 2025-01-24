package Queue;

public class ArrayQueue implements Queue {
    private Object[] array;
    private int size;

    public ArrayQueue(int size) {
        this.array = new Object[size];
        this.size = 0;
    }

    public void resize() {
        Object[] array2 = array;
        array = new Object[array2.length * 2];
        System.arraycopy(array2, 0, array, 0, size);
    }

    public void add(Object e) {
        if (size == array.length)
            resize();
        this.array[size] = e;
        size++;
    }

    public Object first() {
        if (size == 0)
            throw new IllegalStateException("queue is empty");

        return array[0];
    }

    public Object remove() {
        Object temp = array[0];
        int i = 0;
        for (; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;

        return temp;
    }

    public int size() {
        return size;
    }

    public String toString(ArrayQueue queue) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; i++)
            stringBuffer.append(array[i]);

        return stringBuffer.toString();
    }

    public Object getLast(ArrayQueue queue) {
        if (size == 0)
            throw new IllegalStateException("Queue is empty");

        return array[size - 1];
    }

    public boolean equals(ArrayQueue queue1, ArrayQueue queue2) {
        if (queue1.size != queue2.size)
            return false;

        for (int i = 0; i < queue1.size; i++) {
            if (!queue1.array[i].equals(queue2.array[i]))
                return false;
        }
        return true;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue1 = new ArrayQueue(7);
        arrayQueue1.add("1");
        arrayQueue1.add("2");
        arrayQueue1.add("3");
        arrayQueue1.add("4");
        arrayQueue1.add("5");
        arrayQueue1.add("6");
        arrayQueue1.add("7");

        arrayQueue1.display();
        System.out.println("\nAfter Removal");
        arrayQueue1.remove();
        arrayQueue1.display();

    }

}