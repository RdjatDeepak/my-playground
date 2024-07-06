public class Revese_array
{
    public static void main(Strings[] args)
    {
        int arr[]={1,4,5,68,98,65,43};
        int start=0;
        int n=arr.length;
        int end=n-1;
        while(start<=end)
        {
            start=end;
            start++;
            end--;
        }
    }
}