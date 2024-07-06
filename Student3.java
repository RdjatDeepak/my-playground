import java.io.*;
public class Student3
{
    /**
     * InnerStudent3
     */
    public interface InnerStudent3
    {
        void m1();   
    }
    /**
     * InnerStudent3_1
     */
    public interface InnerStudent3_1 {
    
        void m2();
    }
    class Sample implements InnerStudent3 ,InnerStudent3_1
    {

        @Override
        public void m1() {
            // TODO Auto-generated method stub
            System.out.println("Welcome inside the method m1");
            throw new UnsupportedOperationException("Unimplemented method 'm1'");

        }
        @Override
        public void m2() {
            // TODO Auto-generated method stub
            System.out.println("Welcome inside the function m2");
            throw new UnsupportedOperationException("Unimplemented method 'm2'");
        }
    }
    public static void main(String[] args) 
    {
        Student3 obj =new Student3();
        ((Student3.InnerStudent3) obj).m1();
        ((Student3.InnerStudent3_1) obj).m2();
    }   
}