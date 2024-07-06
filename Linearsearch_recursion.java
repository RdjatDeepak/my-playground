public class Linearsearch_recursion
{
    public static void main(String args[])
    {
        int arr[]={5,4,3,7,1,0};
        int key=1;
        Linearsearch_recursion obj=new Linearsearch_recursion();
        obj.linearsearch(arr,key);
    }
    bool linearsearch(int arr[],int key)
    {
        if(size==0)
        {
            return false;
        }
        if(arr[0]==key)
        {
            return true;
        }
        else 
        {
            bool ans=linearsearch(arr+,size-)
            return ans;
        }
    }
}