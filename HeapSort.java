public class HeapSort
{
    public void sort(int arr[])
    {
        int N=arr.length;
        for(int i=N/2-1;i>=0;i--)
        {
            heapify(arr,N,i)
        }
        for(int i=N-1;i>=0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0)
        }
    }
    void heapify(int arr[],int N, int i)
    {
        int largest=i;
        int l=2*i;
        int r=2*i+1;
        if(l<N && arr[l]>arr[largest])
        {
            largest=l;
        }
        f(r<N && arr[r]>arr[largest])
        {
            largest=r;
        }
        if(largest!=i)
        {
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;

            heapify(arr,N,largest);
        }
    }
    public static void main(String []args)
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int N = arr.length;
        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr); 
    }
}