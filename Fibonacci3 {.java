public class Fibonacci3
 {
    public static void main(String[] args) {
        int n = 10; // You can change this value to generate a different number of Fibonacci elements
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + n + " elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
