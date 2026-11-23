package lab5.exercise3_hw;



public class Stack<T> {

    private T[] items;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        items = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T value) {
        if (top == items.length - 1) {
            throw new IllegalStateException("Stack is full.");
        }

        top++;
        items[top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        T value = items[top];
        items[top] = null;
        top--;

        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

