import java.util.Scanner;
class factorial 
{
    public static void main(string args[])
    {
        Scanner obj=new Scanner(system.in);
        int f=1;
        System.out.println("Enter the value of n::");
        int n=ob.nextInt();
        while(n>0)
        {
            f=f*n;
            n=n-1;
        }
        System.out.println("the factorial of n is::"+n);
    }
}