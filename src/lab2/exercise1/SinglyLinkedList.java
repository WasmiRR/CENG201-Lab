//Name and Surname : Enes ATICI
//Student ID: 240444030
//Date: 12.10.2026


package lab2.exercise1;


public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }


    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }


    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }

        System.out.println("NULL");
    }


    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        int count = 0;
        Node current = head;


        while (current != null) {
            count++;
            current = current.next;
        }


        int middleIndex = count / 2;


        current = head;

        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }

        return current;
    }


    public Node getHead() {
        return head;
    }
}