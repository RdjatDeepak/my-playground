import java.util.Scanner;
class Reversal_number
{
    public static void main(String[] args)
    {
        int n,rev=0;
        Scanner sc=new Scanner(System.in); //import from key bord
        System.out.println("Enter the number::");
        n=sc.nextInt();
        while(n>0)
        {
           rev=n%10;
           n=n/10;
            System.out.print(rev+" ");
        }
    }
}