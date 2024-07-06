import java.util.*;
public class Replace_number
{
    //replace a number again and again by another number
    public static void main(String args[])
    {
        int arr[], n,oldnum,newnum;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array::");
        n=sc.nextInt();
        arr=new int[n];
        System.out.print("Enter "+n+" Elements of the array::");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the old number ::");
        oldnum=sc.nextInt();
        System.out.print("Enter the new number by which we have to replace ::");
        newnum=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==oldnum)
            {
               arr[i]=newnum;
            }
        }
        System.out.print("array after modification::");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}