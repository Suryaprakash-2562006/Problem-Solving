class Solution {
    public int specialArray(int[] nums) {

        
        int len = nums.length;

        for(int i=0;i<=len;i++){

            int count = 0;
            
            for(int n : nums){
                if(n >= i) count++;
            }

            if(count == i) return count;
        }


        return -1;




        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna