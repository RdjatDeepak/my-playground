import java.util.Scanner;
public class Pattern2_practice
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
           for(int j=0;j<=n;j++)
           {
            if(i>=j)
            System.out.print(" "+j);
           } 
            System.out.println("");
        }
        
    }
}