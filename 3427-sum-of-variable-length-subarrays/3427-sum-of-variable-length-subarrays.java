class Solution {
    public int subarraySum(int[] nums) {
        int res=0;

        for(int i=0;i<nums.length;i++){
            int sum=0;
            int st=Math.max(0, i-nums[i]);
            for(int j=st;j<=i;j++){
                res+=nums[j];
            }
            
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna