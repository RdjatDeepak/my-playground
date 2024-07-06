public class Bubble_sort
{
    public static void main(String args[]) 
    {
        int arr[]={9,7,5,4,10,6,0,1};
        int n=arr.length;
        for(int i=1;i<n-1;i++)
        {
            for(int j=0;j<n-i;j++)
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            System.out.println("");
        }
        System.out.println("This is the sorted array::");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+"  ");
        }
    }
}