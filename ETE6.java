import java.util.Scanner;
public class ETE6
{
        public static int[] generateSortedArray(int n) {
            int[] arr = new int[n];
            int max = n;
            int min = 1;
            boolean isMaxTurn = true;
    
            for (int i = 0; i < n; i++) {
                if (isMaxTurn) {
                    arr[i] = max;
                    max--;
                } else {
                    arr[i] = min;
                    min++;
                }
                isMaxTurn = !isMaxTurn;
            }
            return arr;
        }
    
        public static void main(String[] args) {
            int n = 10; // Change the value of n as per your requirement
            int[] sortedArray = generateSortedArray(n);
    
            System.out.println("Generated Array:");
            for (int num : sortedArray) {
                System.out.print(num + " ");
            }
        }
    }
    