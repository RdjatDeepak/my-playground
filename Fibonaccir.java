public class Fibonaccir
{
    public static int  fibonaccirec(int n,int a,int b)
    {
        if(a==n)
        {
            return a;
        }
        return fibonaccirec(n,b,a+b);
    }
    public static void main(String[] args)
    {
        int n=5;
        int a=0,b=1;
        int result =fibonaccirec(n,a,b);
        System.out.println(result);
    }
}
