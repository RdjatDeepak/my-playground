public class minimum
{
    public static void main(String[] args) 
    {
        int arr[]= {7,1,5,3,6,4}; 
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        } 
        System.out.println("minimum number is ::"+min);
    }
}