import java.util.Scanner;
class My_Array
{
    public static void main(String args[])
    {
        int a[],m,i;
    Scanner sc= new Scanner(System.in); //for key bord input
    System.out.println("Enter the size of array ");
     m=sc.nextInt();
     System.out.println("Enter the elements of array  ");
     a=new int[m];
     for(i=0;i<m;i++)
     {
        a[i]=sc.nextInt();
     }
    // elements of mattrix
    System.out.println("elements of array  ");
    for(i=0;i<m;i++);
    {
        System.out.println(a[i]+" ");
    }
    }
}