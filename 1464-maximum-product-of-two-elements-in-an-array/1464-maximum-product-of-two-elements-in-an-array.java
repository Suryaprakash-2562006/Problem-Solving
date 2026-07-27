class Solution {
    public int maxProduct(int[] nums) {

        int maxProd = Integer.MIN_VALUE;


        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){

                int Prod = (nums[i] - 1) * (nums[j] - 1);

                if(Prod > maxProd){
                  maxProd = Prod;
                }

            }

        }

        return maxProd;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna