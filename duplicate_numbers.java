import java.util.Scanner;
class duplicate_numbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int []duplicate={1,1,2,3,4,5,6,7,8,9,9,8,6,5,4,3,6,5,4,1,1,2,3,4};
        int []count=new int[11];
        for(int i=0;i<duplicate.length;i++)
        {
            int val=duplicate[i];
            count[val]++;
        }
        for(int i=0;i<count.length;i++)
        {
            System.out.println(" The ball "+i+" is present "+count[i]+ " time ");
        }

    }
}