import java.util.Scanner;
public class Add_uptri
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[][],m,n;
        int sum =0;
        System.out.println("Enter the number of rows");
        m=sc.nextInt();
        System.out.println("Enter the number of columns");
        n=sc.nextInt();
        a=new int[m][n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(" ");
        //for display the mattrix
        for(int i=0;i<m;i++)
        {
            System.out.println(" ");
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println(" ");
        for(int i=0;i<m;i++)
        {
            System.out.println();
            for(int j=0;j<n;j++)
            {
                if (j>=i)
                {
                    sum = sum+a[i][j];
                }
            }
        }
        System.out.println(sum+" ");

    }
}
