import java.util.Scanner;

class Stack {
    static int top;
    static int n;
    static int arr[];

    public Stack(int size) {
        this.top = -1;
        this.n = size;
        this.arr = new int[n];
    }

    public static boolean isEmpty() 
    {
        if(top==-1)
        return true;
        return false;
    }

    public static boolean isFull() 
    {
        if(top==n-1)
        return true;
        return false;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = value;
            System.out.println("Pushed " + value + " to the stack");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Pop " + arr[top] + " from the stack");
            top--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack s = new Stack(size);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.pop();
        System.out.println("Is Empty: " + s.isEmpty());
        System.out.println("Is Full: " + s.isFull());
    }
}
