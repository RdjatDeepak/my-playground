interface Student 
{ 
public void Roll_No(int x); // abstract method 
     public void show();
    } 
interface CSE
{
public void Roll_No(int x);

public void show(); 
  }
abstract class First
{
}
class CSEinterface extends First implements Student, CSE 
{ 
public void Roll_No(int x) // implementation of abstract method 
    { 
        System.out.println("Student Roll No"+x); 
    } 
  public void show()
  {
    System.out.println("Interface student calling ");
  }
  public static void main(String args[])
  {
    CSE c= new CSE();
    c.Roll_No(22222);
    c.show();
  }
}