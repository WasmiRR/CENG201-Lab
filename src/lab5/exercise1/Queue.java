package lab5.exercise1;


/**
 * Queue.java
 *
 * Your Name:        Enes ATICI
 * Your Student ID:  240444030
 * Your Date:        16.11.2026
 */




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
        if (isFull()) {
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

        T removedValue = items[front];
        items[front] = null;
        front = (front + 1) % items.length;
        count--;

        return removedValue;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < count; i++) {
            int index = (front + i) % items.length;

            result.append(items[index]);

            if (i < count - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }
}
