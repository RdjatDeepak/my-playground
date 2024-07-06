import java.util.Scanner;
public class Stack_Array1 {
    int top;
    int n;
    int[] arr;
    public Stack_Array1(int size)
    {
        this.n = size;
        this.top = -1;
        this.arr = new int[n];
    }

    public void push(int value)
    {
        if (top == n - 1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            arr[top] = value;
            System.out.println("Pushed " + value + " to the stack");
        }
    }

    public void pop()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Popped " + arr[top] + " from the stack");
            top--;
        }
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public void isFull() {
        if (top == n - 1) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();

        Stack_Array1 stack = new Stack_Array1(size);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.pop();
        stack.pop();
        stack.isEmpty();
        stack.isFull();
    }
}
