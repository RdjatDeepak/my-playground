import java.util.*;
public class Stack_recuesion
{
    public static void PushAtBottom(int data , Stack<Integer> s )
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        PushAtBottom(data,s);
        s.push(top);
    }

    public static void main(String[] args)
    {
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        PushAtBottom(5,s);
        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
