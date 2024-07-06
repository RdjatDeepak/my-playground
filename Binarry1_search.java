public class Binarry_search
{
    public static void main (Strin args[])
    {
        Binarry_search obj = new Binarry_search();
        int arr[]={1,2,5,6,8,98,76,45,34};
       // int key = 76;
        int result=obj.binarrysearch(arr,76);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);
    }
   int binarrysearch(int arr[],int key)
   {
        int start=0;
        int end=arr.length-1;
        boolean keyfound=false;
        while(start<end)
       {
         int mid = (start+end)/2;
         if(arr[mid]==key)
         return mid;
        //  {
        //  keyfound=true;
        //  System.out.print("Index of Key::"+m);
        //  }
        //  // If x greater, ignore left half
         if (arr[mid] < key)
                start = mid + 1;
            // If x is smaller, ignore right half
            else
                end = mid - 1;
        } 
        return -1;
            //   if(!keyfound)
            // {
            //    System.out.println("Key is not present");
            //    keyfound=false;
            // } 
            // return keyfound ? 1 : -1;
    }
}