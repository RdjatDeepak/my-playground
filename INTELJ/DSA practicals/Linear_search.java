public class Linear_search
{
    public static void main(String[] args)
    {
        int arr[]={8,9,5,7,4,6,3,5,22};
        int key=6;
        for( int i =0;i< arr.length-1;i++)
        {
           if(arr[i]==key)
           {
               System.out.println("Target is found at index::"+i);
           }
        }
    }
}
