public class Reverse1_array
{
    public static void main(String args[])
    {
        int arr[]={1,44,5,67,8,9,3};
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
     }
}