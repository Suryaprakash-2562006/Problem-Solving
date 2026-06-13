class Solution {
    public void moveZeroes(int[] nums) {

        

        int nz = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != 0)
            {
                nums[nz] = nums[i];
                nz++;
            }
        }

        for(int i=nz;i<nums.length;i++){
            nums[i] = 0;
        }

        

        for(int x : nums)
        {
            System.out.print(x + " ");
        }
        
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna