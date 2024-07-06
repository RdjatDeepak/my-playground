import java.util.Scanner;
public class My_practice
{
    void input()
    {
    Scanner sc=new Scanner(System.in);//keybord input 
    int a[][],m,n;
    system.out.println("Enter the number of rows");
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
        system.out.println("Elements of Matrix");
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
        My_practice obj=new My_practise();
        obj.input();
        obj.display();
    }
}