class Solution {
    public String triangleType(int[] nums) {
        if(nums.length == 3){
            
            int a = nums[0];
            int b = nums[1];
            int c = nums[2];

            if(a + b <= c || a + c <=b || b + c <= a) return "none";
            else if(a==b && b==c) return "equilateral";
            else if(a==b || a==c || b==c) return "isosceles";
        }
        return "scalene";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna