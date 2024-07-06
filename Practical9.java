
import java.util.Scanner;
public class Practical9
{
    public static void main(String[] args)
    {
       
        int arr[],n,st,end;
        Scanner sc=new Scanner(System.in); //for input
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        System.out.println("Enter the Elements of array:");
        arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\nElements of array before reverse ");
        for(int i=0;i<n;i++)
        {
           System.out.println(arr[i]+" ");
        }
        //Reverse of array
        System.out.println("Reverse of array is::");

            st=0;
            end=arr.length-1;
        while(st<end)
        {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }

        for( int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
