interface printable
{
    void print();
}

interface Showable extends printable
{
void Show();
}
class A6 implements Showable
{
    public void print()
    {
        System.out.println("Hello");
    }
    public void Show()
    {
        System.out.println("Welcome");
    }
    public static void main(String args[])
    {
        A6 obj=new A6();
        obj.print();
        obj.Show();
    }
}