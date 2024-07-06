import java.util.Scanner;

public class Prime_number
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0, sum = 0;
        System.out.println("Enter the starting number : ");
        int start = sc.nextInt();
        System.out.println("Enter the ending number : ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                sum += num;
            }
        }

        System.out.println("Number of prime numbers are: " + count);
        System.out.println("Sum of prime numbers is: " + sum);
    }
}
