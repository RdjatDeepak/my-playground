import java.util.*;
public class Selection1_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[] ;
        int n;
        System.out.print("Enter the size of array::");
        n=sc.nextInt();
        arr=new int[n];
        System.out.print("Enter "+n+" Elements of the array::");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n-1;j++)
            {
                if(arr[j]<arr[min])
                min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("Now the sorted array is::");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}