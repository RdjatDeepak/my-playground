import java.util.*;
public class insertion_sort
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
        for (int i = 1; i < n; i++)
        {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp)
            {
                //sifting
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println("print the sorted array array::");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}