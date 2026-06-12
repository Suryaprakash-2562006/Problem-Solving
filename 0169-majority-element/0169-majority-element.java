class Solution {
    public int majorityElement(int[] nums) {

        int maxCount = 0;
        int majElem = nums[0];
        
        for(int i=0;i<nums.length;i++){
            int count = 0;

            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                majElem = nums[i];
            }
        }

        return majElem;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna