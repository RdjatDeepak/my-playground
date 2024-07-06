import java.sql.SQLOutput;
import java.util.Scanner;
public class Practical9
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int arr[],n;
        int st=0;
        System.out.println("Enter the length of array::");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of array::");
        for( int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Before operation array is ");
        for( int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]==0)
                {

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after operation is ::");
        for( int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
