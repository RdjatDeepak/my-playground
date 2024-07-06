public class LL
{
    private int size;
    LL()
    {
        this.size=size;
    }
    class Node
    {
        String data;
        Node next;
          Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }    
    public Node head = null;
    //Add a new node
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
    //add a new node in last
    public void addLast(String data)
    {
        
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node curNode =head;
        while (curNode.next != null)
        {
            curNode =curNode.next;
        } 
        curNode.next=newNode;
        size++;
    }
    //For display the linked list
    public void display()
    {
        if(head==null)
        {
            System.out.println("List is empety");
            return;
        }
        Node curNode=head;
        while(curNode != null)
        {
            System.out.print(curNode.data+" -->>");
            curNode=curNode.next;
        }
        System.out.println("null");
    }
    //delete the node from starting
    public void deletefirst()
    {
        if(head==null)
        {
            System.out.print("List is empety");
            return;
        }
         size--;
        head=head.next;
    }
    //delete the node from ending
    public void deletelast()
    {
        if(head==null)
        {
            System.out.print("List is empety");
            return;
        }
        size--;
        //if one node 
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
    public int getSize()
    {
        return size; 
    }
    public static void main(String[] args) 
    {
        LL obj=new LL();
        obj.addLast("executed");
        obj.addFirst("done");
        obj.addFirst("have");
        obj.addFirst("Program");
        obj.addFirst("First");
        obj.display();
        obj.deletefirst();
        obj.deletelast();
        obj.display();
        System.out.println("Size of linked list is->"+obj.getSize());
    }
}
