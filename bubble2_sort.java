import java.util.*;
public class bubble2_sort
{
    public static void main(String args[])
    {
        int arr[], n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array::");
        n=sc.nextInt();
        arr=new int[n];
        System.out.print("Enter "+n+" Elements of the array::");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1]) //if comparing terms is greater then last ter, then
                {
                    //Swap the numbers
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        
        }
        System.out.println("This is the sorted array::");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+"  ");
        }
    }
}