import java.util.*;
public class Linear2_search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[],key,size;
        System.out.print("Enter the value of key::");
        key =sc.nextInt();
        System.out.print("Enter the Size of array::");
        size =sc.nextInt();
        System.out.print("Enter the elements os array::");
         arr=new int[size];
         for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean keyfound=false;
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
             keyfound=false;
          } 
    }
}
