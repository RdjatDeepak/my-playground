import java.util.Scanner;

public class BinarySearch2 {
    public static boolean binarySearch(int key, int arr[]) {
        int strt = 0;
        int end = arr.length - 1;
        boolean keyfound = false;

        while (strt <= end) {
            int mid = (strt + end) / 2;

            if (arr[mid] == key) {
                System.out.print("Target is found at index: " + mid);
                keyfound = true;
                break;
            } else if (arr[mid] < key) {
                strt = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return keyfound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[], n, key;

        System.out.println("Enter the size of array");
        n = sc.nextInt();

        System.out.println("Enter the element for search");
        key = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter the elements of the array ->");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = binarySearch(key, arr);
        System.out.println("Target found: " + result);
    }
}
