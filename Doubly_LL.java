public class Doubly_LL 
{
    public class Node 
    {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head = null;

    public void addFirst(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newNode;
        newNode.prev = curNode;
    }
    public void deletefirst()
    {
        if(head==null)
        {
           System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    // public void deletelast()
    // {
    //     if(head==null)
    //     {
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     if(head.next==null)
    //     {
    //         head=null;
    //         return;
    //     }
    //     Node curNode=head;
    //     while(curNode.next!=null)
    //     {
    //         curNode=curNode.prev;
    //     }
    //     if (curNode.prev != null) 
    //     {
    //         curNode.prev.next = null;
    //     } else {
    //         head = null; // If there is only one node, set head to null
    //     }
    // }
    public void display() 
    {
        if (head == null) 
        {
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -->>");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) 
    {
        Doubly_LL obj = new Doubly_LL();
        obj.addFirst(8);
        obj.addFirst(32);
        obj.addFirst(45);
        obj.addFirst(56); 
        obj.addFirst(79);
        obj.addLast(876);
        obj.deletefirst();
        // obj.deletelast();
        obj.display();
    }
}
