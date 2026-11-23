package lab5.exercise3_hw;



public class Queue<T> {

    private T[] items;
    private int front;
    private int rear;
    private int count;

    @SuppressWarnings("unchecked")
    public Queue(int capacity) {
        items = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(T value) {
        if (count == items.length) {
            throw new IllegalStateException("Queue is full.");
        }

        rear = (rear + 1) % items.length;
        items[rear] = value;
        count++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        T value = items[front];
        items[front] = null;
        front = (front + 1) % items.length;
        count--;

        return value;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}

