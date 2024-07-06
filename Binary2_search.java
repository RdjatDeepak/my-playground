import java.util.Scanner;
public class Binary2_Search
{
    public static boolean binarySearch(int[]arr, int target)
    {
      int n = arr.length;
      int st = 0, end = n-1;
      while (st<=end)
        {
            int mid = (st+end)/2;
            if (target == arr[mid])
            {
                System.out.println("Target found at::"+mid);
                return true;
            }
            else if (arr[mid]<target)
            {
             st = mid+1;
            }
            else  
            {
            end = mid-1;
            }
        }
            return false;
    }
        public static void main(String[] args)
         {
    Binary2_Search obj = new Binary2_Search();  // Corrected class name
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter " + n + " elements: ");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter the target: ");
    int target = sc.nextInt();
    System.out.println(" ");
    
    boolean result = obj.binarySearch(arr, target);  // Corrected method name
    System.out.println("Target found: " + result);
}

}