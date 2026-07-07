class Solution {
    public int minOperations(int[] nums) {

        int count = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                count += nums[i-1] + 1 - nums[i];
                nums[i] = nums[i-1] + 1;
            }
        }
        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna