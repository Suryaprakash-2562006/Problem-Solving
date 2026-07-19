class Solution {
    public int findClosestNumber(int[] nums) {
        int close = Integer.MAX_VALUE;
        int n = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int diff = 0;

            if(num >= 0){
                diff = num - 0;
            }
            else diff = (num * (-1)) - 0;

            if(diff < close){
                close = diff;
                n = num;
            }

            else if(diff == close && num > n) n = num;
        }
        return n;

        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna