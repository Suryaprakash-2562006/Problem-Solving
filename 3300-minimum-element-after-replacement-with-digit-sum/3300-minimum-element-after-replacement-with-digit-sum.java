class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int arr[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            int n = nums[i];

            while(n > 0){
                int ld = n % 10;
                sum += ld;
                n /= 10;
            }
            arr[i] = sum;
            
        }

        for(int n : arr){
            if(n < min){
                min = n;
            }
        }
        return min;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna