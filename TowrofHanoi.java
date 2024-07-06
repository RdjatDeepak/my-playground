import java.util.Scanner;

public class TowrofHanoi
{
    public static void tower(int ndisc,int source,int auxiliary,int destination)
    {
        if(ndisc<1)
        {
            return;
        }
        if(ndisc==1)
        {
            System.out.println("Move disc 1 from tower " + source + " to tower " + destination);
            return;
        }
        // else
        // {
        tower(ndisc-1, source,  destination, auxiliary);
        { 
            System.out.println("Move disc " + ndisc + " from tower " + source + " to tower " + destination);
        }
        tower(ndisc-1, auxiliary, source, destination);
    }
    public static void main(String[] args) 
    {
        TowrofHanoi obj =new TowrofHanoi();
        int ndisc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of disc");
        ndisc=sc.nextInt();
        TowrofHanoi.tower(ndisc, 1, 2, 3);
    }
}