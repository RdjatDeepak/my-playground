public class BinarySearchRec2
{
    public static void binarysearch(int key,int strt,int end,int arr[])
    {
         end=arr.length-1;
        int mid=(strt+end)/2;
        if(strt>end)                //base comdition
        {
            System.out.println("Key not found");
            return;
        }
        if(arr[mid]==key)
        {
            System.out.println("key found at index:"+mid);
            return;
        }else if(arr[mid]<key)
        {
            binarysearch(key ,mid+1,end,arr);
        }
        else {
            binarysearch(key,strt,mid-1,arr);
        }
    }
    public static void main(String[] args)
    {
     int arr[]={1, 2, 5, 6, 8, 98, 76, 45, 34};
     int key=2;
     binarysearch(key,0,arr.length-1,arr);
    }
}
