public class Rev_Array
{
    public static void ReverseArray(int strt,int end,int arr[])
    {
        if(strt>=end)
        {
            return ;
        }
        int temp=arr[strt];
        arr[strt]=arr[end];
        arr[end]=temp;
        ReverseArray(++strt,--end,arr);
    }
    public static void main(String[] args)
    {
     int arr[]={1,2,3,4,5,6};
     int strt=0;
     int end=arr.length-1;
     ReverseArray(strt,end,arr);
     //print reversed array
        System.out.println("Reverse array is::");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
    }
}
