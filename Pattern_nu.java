import java.util.Scanner;
public class Pattern_nu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,num=1;
        System.out.print("Enter value of m:");
        m=sc.nextInt();
         System.out.print("Enter value of n:");
        n=sc.nextInt();
        for(int i=1;i<=m;i++)
        {
             for(int j=1;j<=i;j++)
             {
                //if(j<=n-i+1)
              System.out.print(" "+num);
              num++;
           } 
            System.out.println(" ");
        }
        
    }
}