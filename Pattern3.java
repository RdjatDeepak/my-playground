import java.util.Scanner;
public class Pattern3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.print("Enter value of m:");
        m=sc.nextInt();
         System.out.print("Enter value of n:");
        n=sc.nextInt();
        for(int i=1;i<=m;i++)
        {
           for(int j=1;j<=n-i;j++)
           {
            System.out.print(" ");
           }
             for(int j=1;j<=i;j++)
             {
              System.out.print("*");
           } 
            System.out.println(" ");
        }
        
    }
}