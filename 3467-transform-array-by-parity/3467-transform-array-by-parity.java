class Solution {
    public int[] transformArray(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)nums[i]=0;
            else nums[i]=1;
        }

        Arrays.sort(nums);

        return nums;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna