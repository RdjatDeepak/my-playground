import java.util.*;
public class repeating_num
{
    public static void main(String args[])
    {
        int arr[], n,key;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array::");
        n=sc.nextInt();
        arr=new int[n];
        System.out.print("Enter "+n+" Elements of the array::");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the repeating number ::");
        key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
            arr[i-1]=arr[i];
            }
                
        }
        System.out.println("print the new array::");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }

    }
}