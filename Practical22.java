class Practical22
{
    public static void main(String[]args)
    {
        int c=100;
        int n=4;
        int arr[][]={{1,2,5,6},{4,5,7,8},{5,6,7,8},{7,9,4,2}};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp=arr[i][j]+ c;
                arr[i][j]=arr[j][i];
                arr[j][i]=temp-c;
            }
        }
        for (int i = 0; i <n; i++)
        {
            for (int j = 0; j <n; j++)
            {
                System.out.print(" "+arr[i][j]); // Print the array elements
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}