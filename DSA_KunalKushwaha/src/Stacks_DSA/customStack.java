package Stacks_DSA;

public class customStack {
    protected int [] data;
    private static final int Default_Size = 10;
    int ptr = -1;

    public customStack(){
    }
    public customStack(int size){
       this.data = new int[size];
    }
    public boolean push(int item){
        if (isFull()){
            throw new IllegalStateException("Stack is full");
        }
        data[ptr] = data[item];
        ptr++;
        return true;
    }
    public  int pop(){
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    public  int peek(){
        if (isEmpty()){
            throw new IllegalStateException("STack is empty");
        }
        return data[ptr];
    }
    // if size of the stack is full then we make a new stack of double the size
    public boolean push2(int item) {
        if (this.isEmpty()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[ptr] = data[item];
        ptr++;
        return true;
    }
        public boolean isFull() {
            return ptr == data.length - 1;
        }

    public boolean isEmpty(){
    return ptr == -1;
    }


}
