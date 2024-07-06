import java.util.Scanner;
class ithElement
//delet the ith element of array
{
    public static void main(String args[])
    {
        int ar[]={1,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the position where to delete element::");
        int key=sc.nextInt();
        if (key < 0 || key >= ar.length)
        {
            System.out.println("Invalid position. Position should be between 0 and " + (ar.length - 1));
            return;
        }
         for (int i = key; i < ar.length - 1; i++) 
        {
            ar[i] = ar[i + 1];
        }
        int[] newArray = new int[ar.length - 1];
        for (int i = 0; i < newArray.length; i++) 
        {
            newArray[i] = ar[i];
        }

        // Print the updated array
        System.out.print("Updated array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(" " + newArray[i]);
        }
    }
}