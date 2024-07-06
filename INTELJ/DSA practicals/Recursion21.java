public class Recursion21
{
    public static int power(int a , int b)
    {
        if(b==0)
        {
            return 1;
        }
      int result =power(a,b-1);
        return result*a;
    }
    public static void main(String[] args)
    {
        int a=2;
        int b=5;
       int result= power(2,5);
        System.out.println(result);

    }
}
