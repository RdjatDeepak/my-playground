import java.util.Scanner;
public class Mypractice
{
    int a[][],m,n;
    void input()
    {
    Scanner sc=new Scanner(System.in);//keybord input 
    System.out.println("Enter the number of rows");
    m=sc.nextInt();
    system.out.println("Enter the number of columns");
    n=sc.nextInt();
    a=new int[m][n];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    }
    void display()
    {
        System.out.println("Elements of Matrix");
        for(int i=0;i<m;i++)
        {System.out.println(" ");
            for(int j=0;j<n;j++)
            {
                system.out.println(" "+a[i][j]);
            }
        }
    }
    public static void main(string[] args)
    {
        Mypractice obj=new Mypractice();
        obj.input();
        obj.display();
    }
}