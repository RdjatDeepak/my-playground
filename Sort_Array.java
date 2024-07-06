 void sort(int []a)
    {
        int i,j,temp;
        for(i=0;i<a.length-1;j++)
        {
            for(j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(i=0;i<a.length-1;j++){
        system.out.println(a[i]);
        }
    }
class bublesort{
    public static void main(String args[])
    {
        sort s=new sort();
        int[]a={6,9,0,54,8};
        s.sort(a);
    }
}