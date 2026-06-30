class Solution {
    public int countPartitions(int[] nums) {

        int sum = 0;
        
        int count = 0;

        for(int i=0;i<nums.length-1;i++){
            sum += nums[i];
            int remSum = 0;

            for(int j=i+1;j<nums.length;j++){
                remSum += nums[j];
            }

            if(Math.abs(sum - remSum) % 2 == 0){
                count++;
            }
        }

        return count;

        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna