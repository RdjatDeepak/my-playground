public class Binarry_search
{
   int binarrysearch(int arr[],int key)
   {
        int s=0;
        int e=arr.length-1;
        boolean keyfound=false;
        while(s<e)
       {
         int m = s+(e-s)/2;
         if(arr[m]==key)
         {
         keyfound=true;
         System.out.print("Index of Key::"+m);
         }
         // If x greater, ignore left half
         if (arr[m] < key)
                s = m + 1;
            // If x is smaller, ignore right half
            else
                e = m - 1;
        } 
              if(!keyfound)
            {
              System.out.println("Key is not present");
              keyfound=false;
            } 
            return keyfound ? 1 : -1;
    }
    public static void main (Strin args[])
    {
        Binarry_search obj = new Binarry_search();
        int arr[]={1,2,5,6,8,98,76,45,34};
        int key = 76;
        obj.binarrysearch(arr,76);
    }
 }