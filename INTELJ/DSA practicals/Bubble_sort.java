public class Bubble_sort
{
    public static void main(String[] args) {
        int arr[] = {8, 9, 7, 4, 24, 6, 3, 5, 22};
        int key;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                    if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
            }
        }
        System.out.println("The sorted array is ::");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
