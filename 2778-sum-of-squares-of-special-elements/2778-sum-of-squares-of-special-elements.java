class Solution {
    public int sumOfSquares(int[] nums) {
        // int sum = 0;
        // int n = nums.length;
        // for(int i=1;i<=n;i++){
        //     if(n % i == 0){
        //         sum += (nums[i-1] * nums[i-1]);
        //     }
        // }
        // return sum;

        int sqTotal=0;
        for (int i=1; i<=nums.length; i++) {
            if (nums.length%i==0) {
                sqTotal+= nums[i-1]*nums[i-1];
            }
        }
        return sqTotal;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna