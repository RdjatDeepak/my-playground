public class QuicSort3
{
    public static int partation(int arr[],int low,int high)
    {
        int pivot=high;
        int i=low-1;
        for(int j=low;j<high-1;j++)
        {
            if(arr[high]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp =arr[i];
            arr[i]=pivot;
            arr[high]=temp;
            return i;

    }
    public static void quick(int arr,int low,int high)
    {
        if(low <high)
            {
                int pidx=partation(arr,low,high);
                quick(arr,low,pidx-1);
                quick(arr,pidx+1,high);
            }
    }
    public static void main(String[] args) 
    {
        int arr[]={67,76 ,56 ,4,45,655,87,76};
        int n=arr.length;  
        quick(arr, 0, n-1);
        System.out.println("Array after sorted");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}