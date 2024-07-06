import java.util.*;
public class Pattern1_practice
{
    public static void main(String args[])
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n::");
        n=sc.nextInt();
        System.out.print("Enter the value of m::");
        m=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i>=j)
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}