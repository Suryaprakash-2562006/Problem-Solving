class Solution {
    public int firstUniqueEven(int[] nums) {

        int max = 0;

        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        int[] freq = new int[max + 1];

        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0 && freq[nums[i]] == 1){
                return nums[i];
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna