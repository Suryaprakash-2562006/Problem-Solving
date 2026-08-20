class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i] < min1)min1 = nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i] < min2)min2 = nums2[i];
        }
       return min2-min1;

        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // int ans = nums2[0]-nums1[0];

        // return ans;


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna