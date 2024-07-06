public class LL2
{
    static int size;
    LL2()
    {
        this.size=size;
    }
    class Node
    {
        Node next;
        String data;
        Node( String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
           head=newNode;
           return;
        }
        newNode.next=head;
        head = newNode;
        size++;
    }
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node CurNode=head;
        while(CurNode.next != null) 
        {
            CurNode=CurNode.next;
        }
        CurNode.next=newNode;
        size++;
    }
    public void deletefirst()
    {
        if(head==null)
        {
            System.out.print("List is empety");
            return;
        }
        head=head.next;
        size--;
    }
    public void deletelast()
    {
        if(head==null)
        {
            System.out.println("List is empety");
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondlast =head;
        Node lastNode=head.next;
        while (lastNode.next!=null)
        { 
            lastNode=lastNode.next;
            secondlast=secondlast.next; 
        }
        secondlast.next=null;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        Node CurNode=head;
        while(CurNode != null)
        {
            System.out.print(CurNode.data+" -->>");
            CurNode=CurNode.next;
        }
        System.out.println("null");
    }
    public static int getSize()
    {
        return size;
    }
    public static void main(String[] args) 
    {
        LL2 obj=new LL2();
        obj.addFirst("love ");
        obj.addFirst("I");
        obj.addLast("You");
        obj.display();
        System.out.println("Size of the linked list is "+getSize());
        obj.deletefirst();
        obj.deletelast();
        obj.display();  
        System.out.println("Size of the linked list is "+getSize());
    }
}