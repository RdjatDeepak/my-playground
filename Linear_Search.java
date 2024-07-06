import java.util.Scanner;
class Linear_Search
{
    public static void main(String[] args)
    {
      Scanner sc =new Scanner(System.in);
      int arr[]={1,4,5,6,8,9,99,76,54,44};
      int key;
      System.out.println("Enter the value of key");
      key=sc.nextInt();
      boolean keyfound=true;
      //logic in for loop
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]==key)
       {
         System.out.println("key is present at:"+i);
         keyfound=true;
       }
      }
       if(!keyfound)
       {
         System.out.println("Key is not present");
       }
    }
}