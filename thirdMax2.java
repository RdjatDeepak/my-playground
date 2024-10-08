class thirdMax2 {
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        
        for (int i = 0; i < nums.length; i++) {
            if (max1 != null && nums[i] == max1 || max2 != null && nums[i] == max2 || max3 != null && nums[i] == max3) {
                continue; // Skip duplicates
            }
            
            if (max1 == null || nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (max2 == null || nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (max3 == null || nums[i] > max3) {
                max3 = nums[i];
            }
        }
        
        return max3 != null ? max3 : (max1 != null ? max1 : Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, -2147483648};
        thirdMax2 obj = new thirdMax2();
        int result = obj.thirdMax(nums);
        System.out.println("Third maximum number: " + result); 
    }
}
