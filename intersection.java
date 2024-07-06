class intersection {
    public int[] intersection1(int[] nums1, int[] nums2) 
    {
        int nums3=new int[count];
        int count;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                nums3=nums[i];
                count++;
            }
        }
        return nums3[].class;
    }
    public static void main(String[] args)
    {
        int nums1[]={1,2,2,1};
        int nums[]={2,2};
        intersection obj =new intersection();
        int result=obj.intersection1;
        System .out .print(result+"");
    }
}