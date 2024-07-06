public class MergSort1
{
    public static void merge(int arr[],int mid,int strt,int end)
    {
       int merged[]=new int[end-strt+1];
       int index1=strt;
       int index2=mid;
       int k=0;
       while (index1<mid && index2<=end) 
       {
        if(arr[index1]<arr[index2])
        {
            merged[k++]=arr[index1++];
        } 
        else
        {
            merged[k++]=arr[index2++];
        }
        while (index1<mid) 
        {
            merged[k++]=arr[index1++];
        }
        while (index2<=end) 
        {
            merged[k++]=arr[index2++];    
        }
        for(int i=0,j=strt;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }
       }
    }
    public static void mergSort(int arr[],int strt,int end)
    {
        if(strt > end)
        {
            int mid=(strt+(end-strt))/2;
            mergSort(arr, strt, mid);
            mergSort(arr, mid+1, end);
            merge(arr, mid+1, strt, end);
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={78,67,56,45,34,23,12,21,1,76,89,90,100};
        int n=arr.length;

        mergSort(arr, 0, n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print( arr[i]+" ");
        }
        System.out.println(" ");
    }
}