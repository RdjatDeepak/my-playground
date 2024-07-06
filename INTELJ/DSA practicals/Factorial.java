public class Factorial
{
    public static int factorialre(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int result=factorialre(n-1);
        return result*n;
    }
    public static void main(String[] args)
    {
        int n=5;
        int result=factorialre(n);
        System.out.println(result);
    }
}
