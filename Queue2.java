public class Queue2
{
    static class InnerQueue2 
    {
        static int size;
        static int rear = -1;
        static int front = -1;
        static int arr[];
        InnerQueue2(int n)
        {
            this.size=n;
            this.arr=new int[n];
        }  
        public static boolean isEmpty()
        {
            return rear==-1 && front ==-1;
        }
        public static boolean isFull()
        {
            return(rear+1)%size == front;
        }
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr [rear] = data;
        }
        public static int remove() 
        {
            if (isEmpty()) 
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear==front)
            {
                rear=front=-1;
            }
            else
            {
                front=(front+1)%size;
            }
            return result;
        }

        public static int peek() 
        {
            if (isEmpty()) 
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) 
    {
        InnerQueue2 q = new InnerQueue2 (5);
        q.add(1);
        q.add(3);
        q.add(76);
        q.add(4);
        q.remove();
        q.add(78);
        q.remove();
        q.add(89);
        System.out.println("Peek is "+q.peek());
        while (!q.isEmpty()) 
        {
            System.out.println(q.peek());
            q.remove();
        }    
    }
}