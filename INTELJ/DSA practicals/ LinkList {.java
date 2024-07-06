public class LinkList {
    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.next = null;
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNodeFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addNodeLast(int data) {
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
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkList obj = new LinkList();
        obj.addNodeFirst(5);
        obj.display();
    }
}
