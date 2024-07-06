public class Practice6
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int st=0;
        reverseArray (arr,st,arr.length-1);
        for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
    }
    static void reverseArray(int arr[],int st,int end)
    {
        int temp;
        if(st>=end)return;
        temp =arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
        reverseArray(arr,st+1,end-1);
        }
}