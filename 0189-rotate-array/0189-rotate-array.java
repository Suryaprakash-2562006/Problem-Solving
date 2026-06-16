class Solution {
    public void rotate(int[] nums, int k) {
        if(k < 0){
            k = k + nums.length;
        }
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        
    }

    public static void reverse(int a[],int s,int e){
        int start = s;
        int end = e;

        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }

    }
}







// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna