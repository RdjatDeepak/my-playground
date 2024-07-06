import java.util.Scanner;
class My_Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);//keybord imput
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int f=1;
        for(int i=0;i>=n;i++);
        {
            f=f*n;
            n=n-1;
        }
        System.out.println("Factorial of the number is:"+f);
    }
}