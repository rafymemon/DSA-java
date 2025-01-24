package Assingment_Vacations;

public class ArrayStack implements Stack{
    private Object[] a;
    private int size;
    private void resize(){
        Object[] aa=a;
        a = new Object[2*aa.length];
        System.arraycopy(aa, 0, a, 0, size); //  Or we can use this : for(int i=0; i<aa.length; i++) { a[i] = aa[i]; }
    }
    public ArrayStack(int capacity){
        a = new Object[capacity];
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public Object peek(){
        if(isEmpty()) throw new IllegalStateException("Stack is empty");

        return a[size-1];
    }
    public Object pop(){
        if(isEmpty()) throw new IllegalStateException("Stack is empty");
        Object temp = a[--size];
        a[size] = null;
        return temp;
    }
    public void push(Object obj){
        if(size==a.length)
            resize();
        a[size++] = obj;
    }
    public int size(){
        return size;
    }
    public void mergeTwoStack(ArrayStack stack1, ArrayStack stack2){
        ArrayStack temp = new ArrayStack(stack2.size());
        while(!stack2.isEmpty()){
            temp.push(stack2.pop());
        }
        while(!temp.isEmpty()) {
            stack1.push(temp.pop());
        }
    }
   
    public Object getBottom(){
        if(!isEmpty())
            return a[0];
        else
            return null;
    }
    public Object getBottom2(){
        if(!isEmpty()){
            Object temp = a[0];
            for(int i=0; i<a.length-1; i++){
                a[i] = a[i+1];
            }
            size--;
            return temp;
        }
        else
            return null;
    }
    public Object getSecondLast(){
        if(!isEmpty())
            return a[size-2];
        else
            return null;
    }
    public Object getSecondLast2(){
        if(!isEmpty()) {
            Object temp = a[size - 2];
            a[size - 2] = a[size - 1];
            size--;
            return temp;
        }
        else
            return null;
    }
    public ArrayStack duplicate(ArrayStack stack){
        if(!isEmpty()) {
            ArrayStack temp = new ArrayStack(stack.size());
            for (int i = 0; i < stack.size(); i++) {
                temp.push(stack.a[i]);
            }
            return temp;
        }
        else
            return null;
    }
    public ArrayStack reverseArrayStack(ArrayStack arrayStack){
        ArrayStack reverseArrayStack = new ArrayStack(arrayStack.size);
        while (!arrayStack.isEmpty()){
            reverseArrayStack.push(arrayStack.pop());
        }
        return reverseArrayStack;
    }
    public Object searchByIndex(ArrayStack arrayStack, int index){
        if (index < 0 || index > size || arrayStack.isEmpty())
            return null;
        else
            return arrayStack.a[index];
    }
    public boolean searchByElement(Object element){
        for (int i=0; i<size; i++){
            if(this.a[i].equals(element))
                return true;
        }
        return false;
    }
    public void printArrayStack(ArrayStack arrayStack){
        for(int i=arrayStack.size-1; i>=0; i--) {
            System.out.println(arrayStack.a[i]);
        }
  
}
public void mergeTwoStack2(ArrayStack stack1, ArrayStack stack2){
    for(int i = 0; i< stack2.size(); i++)
        stack1.push(stack2.a[i]);
}
}