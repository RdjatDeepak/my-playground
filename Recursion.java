import java.util.Scanner;

public class Recursion
{
    public static int calcfactorial(int n) 
    {   
        if(n==0||n==1)
        {
            return 1;
        }
        int fact_nm1=calcfactorial(n-1);
        int fact=n*fact_nm1;
        return fact;
    }

    public static void main(String[] args)
    {  
        int n=5;
        int ans=calcfactorial(n);
        System.out.println(ans);
    }
}
