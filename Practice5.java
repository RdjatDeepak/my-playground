public class Practice5
{
    public void display()
    {
        int arr[]={22,11,45,34,36};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array after sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[]args)
    {
       Practice5 obj=new Practice5();
       obj.display();
    }
}