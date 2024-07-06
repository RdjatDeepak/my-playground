import java.util.*;
public class multi_check
{
    public static void main(String args[])
    {
        int arr[], n,target;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array::");
        n=sc.nextInt();
        arr=new int[n];
        System.out.print("Enter "+n+" Elements of the array::");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target ::");
        target=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            if(arr[j]*arr[i]==target)
            System.out.print(arr[i]+  " and " + arr[j]+ "  are elements whose multiple is::  "+target);
        }
    }
}