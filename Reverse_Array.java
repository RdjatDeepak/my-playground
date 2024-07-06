import java.util.Scanner;
class Reverse_Array
{
    public static void main(String[] args)
    {

        int a[],m,st=0,end;
        Scanner sc=new Scanner(System.in); //for input
        System.out.println("Enter the size of array:");
        m=sc.nextInt();
        System.out.println("Enter the Elements of array:");
        a= new int[m];
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("\nElements of array before reverse ");
        for(int i=0;i<m;i++)
        {
           System.out.println(a[i]+" ");
        }
        reverseArray (a,st,a.length-1);
        System.out.println("\nElements of array after reverse ");
        for(int i=0;i<m;i++)
        {
         System.out.println(a[i]+" ");
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
