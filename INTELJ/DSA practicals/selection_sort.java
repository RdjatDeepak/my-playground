public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {5, 6, 2, 8, 98, 1, 76, 45, 34};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            // Swap elements if the minimum is found
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array is ::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

