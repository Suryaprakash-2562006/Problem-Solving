class Solution {
    public boolean isMonotonic(int[] nums) {
    //     boolean inc = true,dec = true;
    //    for(int i=0;i<nums.length-1;i++){
    //     if(nums[i] > nums[i+1]) inc = false;
    //     if(nums[i] < nums[i+1]) dec = false;
    //    }
    //    if(inc || dec) return true;
    //    return false;

       boolean increasing = true;
       boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            } else if (nums[i] < nums[i - 1]) {
                increasing = false;
            }

            if (!increasing && !decreasing) {
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna