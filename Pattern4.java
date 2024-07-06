import java.util.Scanner;
public class Pattern4
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
             for(int j=1;j<=n;j++)
             {
                if(j<=i)
              System.out.print(j+"");
           } 
            System.out.println(" ");
        }
        
    }
}