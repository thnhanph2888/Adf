package practice.implement_stack_use_array;

public class MyStack {
    private int[] arr;
    private int size;
    private int index;

    MyStack(int size) {
        this.size = size;
        arr = new int[this.size];
    }

    public void push(int element) {
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int size(){
        return index;
    }
    public boolean isFull(){
        return index == size;
    }

    public boolean isEmpty(){
        return index == 0;
    }
}
