class Fibonacci2
{
    public static void main(String[] args)
    {
        int a=0,b=1;
        int n=5;
        for(int i=0;i<n;i++)
        {
            int m=a+b;
            System.out.print(a+" ");
            a=b;
            b=m;
        }
    }
}