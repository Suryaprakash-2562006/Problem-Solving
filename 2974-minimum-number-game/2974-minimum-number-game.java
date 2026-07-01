class Solution {
    public int[] numberGame(int[] nums) {

        int arr[] = new int[nums.length];


        Arrays.sort(nums);

        for(int i=0;i<nums.length;i+=2){

            arr[i] = nums[i+1];
            arr[i+1] = nums[i];

        }

        return arr;


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna