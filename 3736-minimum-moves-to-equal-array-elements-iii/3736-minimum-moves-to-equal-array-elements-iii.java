class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        int max = 0;
        for(int num:nums){
            if(num > max){
                max = num;
            }
        }
        for(int num:nums){
            count =count+Math.abs(num-max);
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna