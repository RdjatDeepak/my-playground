public class fibonacci_Recursion
{
    static int a=0,b=1,c=0;
    static void printFibo(int count)
    {
        if(count>0)
        {
            a=b+c;
            c=b;
            b=a;
        }
        System.out.print(" "+a);
        printFibo(count-1);
        }
public static void main(String[] args)
{
    int count=5;
    System.out.print(c+" "+b);
    printFibo(count-2);
}
}