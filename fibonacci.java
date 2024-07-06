public class fibonacci
{
    public static void main(String[] args)
    {
        int a=0,b=1,c;
        for(int i=1;i<=10;++i)
        {System.out.println(" " +a);
            c=b+a;
            a=b;
            b=c;
        }
        }
    }