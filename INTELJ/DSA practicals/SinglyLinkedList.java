public class SinglyLinkedList
{
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNodefirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addNodelast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // Move to the next line after printing all nodes.
    }

    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.addNodefirst(10);
        obj.addNodefirst(20);
        obj.addNodefirst(30);
        obj.addNodefirst(40);
        obj.addNodelast(50);
        obj.addNodelast(60);

        obj.display();
    }
}
