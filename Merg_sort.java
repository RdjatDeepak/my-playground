import java.util.*;
class Merge_Sort {
    public static void merge(int arr[], int start, int mid, int end) {
        int len1 = mid - start + 1;
        int len2 = end - mid;

        int first[] = new int[len1];
        int second[] = new int[len2];

        for (int i = 0; i < len1; i++) {
            first[i] = arr[start + i];
        }
        for (int j = 0; j < len2; j++) {
            second[j] = arr[mid + 1 + j];
        }

        int index1 = 0, index2 = 0, k = start;

        while (index1 < len1 && index2 < len2) {
            if (first[index1] <= second[index2]) {
                arr[k++] = first[index1++];
            } else {
                arr[k++] = second[index2++];
            }
        }

        while (index1 < len1) {
            arr[k++] = first[index1++];
        }

        while (index2 < len2) {
            arr[k++] = second[index2++];
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int arr[];
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the length of array::");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the values of array ->");
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("\nSorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
