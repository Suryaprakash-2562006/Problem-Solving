class Solution {
    public boolean isArraySpecial(int[] nums) {

        boolean isTrue = true;

        if(nums.length < 2) return true;

        else{
            for(int i=0;i<nums.length-1;i++){
                int add = nums[i]+nums[i+1];

                if(add % 2 == 0){
                    isTrue = false;
                    break;
                }
                else{
                    continue;
                }
            }
        }

        return isTrue;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna