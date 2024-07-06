public class Binarry_Search
{
    public static boolean binarrysearch(int key, int arr[])
    {
        int strt=0;
        int end=arr.length-1;
        boolean keyfound=false;
        while(strt<=end)
        {
            int mid=(strt+end)/2;
            if(arr[mid]==key)
            {
                System.out.println("Target is found at index::"+mid);
                keyfound=true;
                break;
            }
            else if (arr[mid]<key)
            {
                strt=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        if(!keyfound)
        {
            System.out.println("Key is not find ");
        }
        return  keyfound;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,5,6,8,98,76,45,34};
        int key=76;
        boolean result=binarrysearch(key,arr);
        System.out.println(" "+result);
    }
}
