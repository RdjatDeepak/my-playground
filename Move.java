import java.util.Scanner;
class Move
//to move all zeros to the beginning/end of an array.
{
    public static void main(String args[])
    {
        int arr[]={2,0,6,0,5,0,4,0};
        int key=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==key)
            { 
                for (int j = i; j < arr.length - 1; j++)
                {
                    // Swap current element with the next element
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("updated array    ::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print( arr[i]+" ");
        }
    }
}
