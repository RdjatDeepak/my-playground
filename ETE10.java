public class ETE10 
{
    int A, B, X, Y;
    int[][] arr;

    public void SumOdd(int[][] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                if (j % 2 != 0) 
                {
                   if(arr[i][j]%2==0)
                   {
                    X +=arr[i][j];
                   }
                }
            }
        }
        System.out.println("Sum of even elements of odd rows ::"+X);
    }

    public void SumEven(int[][] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                if (j % 2 == 0) 
                {
                    if(arr[i][j]%2 !=0)
                    {
                        Y +=arr[i][j];
                    }
                }   
            }
        }
        System.out.println("Sum of odd elements of Even rows ::"+Y);
    }

    public int calculateResult() 
    {
        return X - Y;
    }
    public void upperTriangular(int arr[][])
    {

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                if(j<=i)
                {
                    A +=arr[i][j];
                }  
            }
        }
        System.out.println("Sum of upper triangular elements::"+A);

    }
    public void lowerTriangular(int arr[][])
    {

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                if(j>=i)
                {
                    B +=arr[i][j];
                }  
            }
        }
        System.out.println("Sum of lower triangular elements::"+B);
    }
    public int calculateResult2() 
    {
        return A*B;
    }


    public static void main(String[] args) {
        int[][] arr = { { 54, 34, 45, 34 }, { 23, 21, 22, 32 },{56,54,34,23},{76,87,98,46} };
        int m = arr.length;
        int n = arr[0].length;

        ETE10 obj = new ETE10();
        obj.SumOdd(arr);
        obj.SumEven(arr);
        int result = obj.calculateResult();
        obj.lowerTriangular(arr);
        obj.upperTriangular(arr);
        int result2=obj.calculateResult2();
        System.out.println("Result of X-Y  : " + result);
        System.out.println("Result of A*B ::  " +result2);
    }
}
