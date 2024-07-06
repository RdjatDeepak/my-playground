import java.util.Scanner;
class Addition
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in); //import from key bord
        System.out.println("Enter first digit ::");
        int a= ob.nextInt();
        System.out.println("Enter Second digit ::");
        int b=ob.nextInt();
        int c=a+b;
        System.out.println("Addition is ::"+c);

    }
}