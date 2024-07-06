public class Merg2_sort
{
    public static void Merg(int arr[],int strt,int mid,int end)
    {
        int merged[]=new int[end-strt+1];
        int index1=strt;
        int index2=mid+1;
        int k=0;
        while(index1 <= mid && index2 <= end)
        {
            if(arr[index1]<arr[index2] )
            {
                merged[k++]=arr[index1];
            }else
            {
                merged[k++]=arr[index2++];
            }
        }    
            while(index1<=mid)
            {
                merged[k++]=arr[index1++];
            }
            while(index2 <= end)
            {
                merged[k++]=arr[index2++];
            }
            for(int i=0,j=strt;i<merged.length;i++,j++)
            {
                arr[j]=merged[i];
            }
        }
    public static void MergSort(int arr[],int strt,int end )
    {
        int mid =(strt+(end-strt))/2;
        if(strt < end)
        {
        MergSort(arr,strt,mid);
        MergSort(arr,mid+1,end);
        Merg(arr, strt, mid, end);
        }
    }
    public static void main(String[] args)
    {
        int arr[]={7,43,2,67,1,8};
       MergSort(arr, 0, arr.length-1);
        System.out.println("Array after sorted");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}