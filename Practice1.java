import java.util.Scanner;
public class Pattern
{
    public static void main(string args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        System.out.print("Enter the value of n::");
        n=sc.nextInt();
        System.out.print("Enter the value of m::");
        m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
            if(i<=j)
            System.out.print("*");
            }
            System.out.println("");
        }
    }
}