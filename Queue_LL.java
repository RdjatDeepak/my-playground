public class Queue_LL
{
    static class Node 
    {  
        Node next;
        int data;
        Node(int data)
        {
            this.next=null;
            this.data=data;
        }    
    }
    static class InnerQueue_LL 
    {
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty()
        {
            return head==null && tail==null;
        }
        public static void add(int data)
        {
            Node newNode=new Node(data);
            if(tail==null)
            {
                tail=head=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empety");
                return -1;
            }
            int front=head.data;
            if(head == tail)
            {
                tail=null;
            }
            head=head.next;
            return front;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) 
    {
        InnerQueue_LL q =new InnerQueue_LL();
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(256);
        q.add(78);

        q.remove();
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}