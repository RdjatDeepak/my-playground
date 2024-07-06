import java.util.*;

public class Merg_sort2 {
    public static void merge(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int k = 0;

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] < arr[index2]) {
                merged[k++] = arr[index1++];
            } else {
                merged[k++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            merged[k++] = arr[index1++];
        }

        while (index2 <= ei) {
            merged[k++] = arr[index2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si < ei) {
            int mid = (si + (ei - si))/ 2;
            mergesort(arr, si, mid);
            mergesort(arr, mid + 1, ei);
            merge(arr, si, mid, ei);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        int n;

        System.out.println("Enter the length of array");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before sorting is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        mergesort(arr, 0, n - 1);

        System.out.print("\nSorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
