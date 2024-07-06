import java.util.*;
class Dsa_1
{
    public static void main(String args[])
    {
        int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the elements of array");
    int a[][]=new int[3][3];
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }//print mattrix
    System.out.println("Here is your mattrix");
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
           System.out.print(a[i][j]+ " ");
        }
        System.out.println();
    }
     
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            if(a[i][j]%2==0)
            {
                sum=sum+a[i][j];
            }
        }
    }
    System.out.println("Sum of all even numbers of an array::"+sum);  
}
}