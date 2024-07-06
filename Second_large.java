class Second_Large 
{
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9};
        int m = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > m)
            {
                m2 = m;
                m = arr[i];
            }
            else if (arr[i] > m2 && arr[i] != m)
            {
                m2 = arr[i];
            }
        }

        if (m2 != Integer.MIN_VALUE) {
            System.out.println(m2 + " is the second largest element");
        } else {
            System.out.println("There is no second largest element");
        }
    }
}