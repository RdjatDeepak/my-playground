public class QuickSort1 {
    static int pi;

    QuickSort1() {
        this.pi = pi;
    }

    public static int partition(int arr[], int low, int high) {
        pi = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) { 
            if (arr[j] < pi) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pi;
        arr[high] = temp;

        return i;
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quicksort(arr, low, pidx - 1);
            quicksort(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {45, 56, 32, 23, 1, 34, 67, 7, 8, 9, 87};
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + "  ");
        }
        System.out.println(" ");
    }
}
