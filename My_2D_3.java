import java.util.Scanner;
class My_2D_3
{
    public static void main(String[] args)
    {
        int a[][],b[][],c[][],m,n;
        Scanner sc=new Scanner(System.in);//For key bord input
        System.out.println("Enter the number of rows::");
        m=sc.nextInt();
        System.out.println("Enter the number of Columns::");
        n=sc.nextInt();
        a=new int[m][n];
        System.out.println("Enter the Elements of Matrix::");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        //code for displaying the rows and elements

        System.out.println("Elements of Matrix");
        for(int i=0;i<m;i++)
        {
            System.out.println(" ");
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }   
         System.out.println("\nElements of Diognal");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}   