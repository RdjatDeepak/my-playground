public class LL4ete
{
    public class Node 
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }    
    }
    public static Node head;
    public static void isEmpty()
    {
        if(head==null)
        return ;
    }
    public static void addfirst(int data)
    {
        Node newNode=new Node(data);
        if(isEmpty())
        {
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data)
    {
        Node newNode=new Node(data);
        if(isEmpty())
        {
            return;
        }
        Node curNode=head;
        while(curNode.next != null)
        {
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }
    public static void deletefirst()
    {
        if(isEmpty())
        {
            return;
        }
        head=head.next;
    }
    public static void deletelast()
    {
        if(isEmpty())
        {
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondlast =head;
        Node lastNode=head.next;
        while (lastNode.next!=null) 
        {
            lastNode=lastnode.next;
            secondlast=secondlast.next;    
        }
        secondlast.next=null;
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("List is empety");
        }
        Node currNode=head;
        while (currNode!=null) 
        {
            System.out.println(currNode.data+" -->>");
            currNode=currNode.next;    
        }
        System.out.println("null");
    } 
    public static void main(String[] args) 
    {
        LL4ete obj =new LL4ete();
        obj.addfirst(2);
        obj.addfirst(4);
        obj.addfirst(6);
        obj.addfirst(8);
        obj.display();
        obj.deletefirst();
        obj.deletelast();
    }    
}