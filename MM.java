public class MM
{
    public static void mummatrix(int a[][],int b[][],int c[][])
    {
        int n=a.length;
        int m=b[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                c[i][j]=0;
                for(int k=0;k<n;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
    }
    public static void main(String [] args)
    {
        int a[][]={{2,3,4,},{4,5,6},{5,6,7}};
        int b[][]={{7,8,9},{9,10,11},{11,12,13}};
        int c[][]=new int[3][3];
        mummatrix(a,b,c);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
        }
    }
}