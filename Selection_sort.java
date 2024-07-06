public class Selection_sort
{
    public static void main (String args[])
    {
        int arr[]={4,6,7,84,2,8,9,0};
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int min =i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] < arr[min])
                min = j;

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.print("Print the sorted array::");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}