public class Bubble_sort1
{
    public static void main(string args[])
    {
    int ar[],a;
    for(int i=0;i<n-i;i++)
    {
        int min=i;
        for(j=i+1;j<n;j++)
        {
            if(ar[j]<ar[min])
            min=j;
        }
        //swaping min
        a=ar[min];
        ar[min]=ar[i];
        ar[i]=a;
    }
    System.out.print("after sorting");
    int n=ar.length;
    for(int i=0;i<n;i++)
    {
        System.out.print(" "+ar[i]);
    }
}
}