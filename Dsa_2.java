public class Dsa_2
{
  //for addition or even rows
    public static void main(String args[])
    {
        int sum=0;
        int a[][]= new int [][]
        {{2,3,4},{3,4,5},{5,7,9},{7,8,4}};
        for(int i=0;i<a.length;i++)
       {
         //int n=i+1;
         for(int j=0;j<a[i].length;j++)
           {
             int n=i+1;
             if(n%2==0)
             {
                sum=sum+a[i][j];
             }
            }
        }
        System.out.println("Sum of even rows of a mattrix ::"+sum);
    }
}