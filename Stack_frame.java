import java.util.*;
public class Stack_frame
{
    public static void main(String[] args) {
       Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Peek value is-->"+s.peek());
        while (!s.isEmpty) 
        {
            System.out.println(s.peek());
            s.pop();    
        }
    }
}