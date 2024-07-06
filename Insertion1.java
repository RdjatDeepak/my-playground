import java.util.Scanner;
class Insertion1
//insert an element in ith position of the array
{
    public static void main(String args[])
    {
        int ar[]={1,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element to insert:");
        int n=sc.nextInt();
        System.out.print("Enter the position where to insert element::");
        int key=sc.nextInt();
        for(int i=0;i<ar.length;i++)
        {
           if(i==key)
           {
            ar[i]=n;
           } 
        }
        System.out.print( "Updated array   ");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print( " "+ar[i]);
        }
    }
}