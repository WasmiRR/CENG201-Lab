package lab6.Exercise1;

public class Stack {

    private Node top;

    public Stack() {
        top = null;
    }

    // STEP 1: push()
    public void push(String value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // STEP 2: pop()
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String value = top.data;
        top = top.next;
        return value;
    }

    // STEP 3: peek()
    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    // STEP 4: isEmpty()
    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        Node current = top;

        while (current != null) {
            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }
}