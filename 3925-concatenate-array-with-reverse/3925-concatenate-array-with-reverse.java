class Solution {
    public int[] concatWithReverse(int[] nums) {
        // int n = nums.length;
        // int[] ans = new int[2 * n];
        // int i = 0;
        // int j = ans.length-1;
        // while(i<n){
        //     ans[i] = nums[i];
        //     ans[j] = nums[i];
        //     i++;
        //     j--;
        // }
        // return ans;

        int n = nums.length;
        int ans[] = new int[n*2];
        int j = 0;

        for(int x : nums){
            ans[j++] = x;
        }

        for(int i=n-1;i>=0;i--){
            ans[j++] = nums[i];
        }
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna