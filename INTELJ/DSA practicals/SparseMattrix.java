import java.util.Scanner;
public class SparseMattrix
{
    public static void main(String[] args)
    {
        int a[][] ,m,n;
        int z=0,nz=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of mattrix");
        m=sc.nextInt();
        System.out.println("Enter the number of column of mattrix");
        n=sc.nextInt();
        a=new int[m][n];
        System.out.println("Enter the number of elements");
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
        //check the mattrix is sparse or not
        System.out.println(" ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==0)
                {
                    z++;
                }
                else
                {
                    nz++;
                }
            }
        }
        if(nz>z)
        {
            System.out.println("It is not a sparse mattrix");
        }
        else
        {
            System.out.println("It is a sparse mattrix");
        }
    }
}
