public class Mergesort2 {
    public static void merge(int arr[], int strt, int mid, int end) {
        int[] merged = new int[end - strt + 1];
        int idx1 = strt;
        int idx2 = mid;
        int k = 0;

        while (idx1 < mid && idx2 <= end) {
            if (arr[idx1] < arr[idx2]) {
                merged[k++] = arr[idx1++];
            } else {
                merged[k++] = arr[idx2++];
            }
        }
        while (idx1 < mid) {
            merged[k++] = arr[idx1++];
        }
        while (idx2 <= end) {
            merged[k++] = arr[idx2++];
        }
        for (int i = 0, j = strt; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void mergesort(int arr[], int strt, int end) {
        if (strt < end) {
            int mid = (strt + end) / 2;
            mergesort(arr, strt, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, strt, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {56, 45, 34, 32, 78, 98, 87, 67, 23, 21, 12, 10, 9, 1};
        int n = arr.length;
       mergesort(arr, 0, n - 1);
        System.out.print("Sorted array is::  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Added for clarity
    }
}
