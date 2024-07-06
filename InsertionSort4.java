import java .util.*;
public class InsertionSort4
{
    public static void main(String[] args) 
    { 
        int arr[] ={8,41,78,56,3,23,22,34,12};
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while (j >= 0 && arr[j] > temp) 
            {
                arr[j+1]=arr[j];
                j--;    
            }
            arr[j+1]=temp;
        }   
        System.out.println("Sorted array in ascending order ::");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        System.out.println( "Sorted array in descending order ::");
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while (j >= 0 && arr[j] < temp) 
            {
                arr[j+1]=arr[j];
                j--;    
            }
            arr[j+1]=temp;
        }   
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        //linear search 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element to search::");
        int key=sc.nextInt();
        for(int i =0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("key found at ::"+i);
            }
        }
    }
}