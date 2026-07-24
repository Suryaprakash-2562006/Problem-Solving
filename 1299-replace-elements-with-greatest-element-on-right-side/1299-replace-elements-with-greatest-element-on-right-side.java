class Solution {
    public int[] replaceElements(int[] arr) {

        for(int i=0;i<arr.length;i++){
            int max = Integer.MIN_VALUE;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max)max = arr[j];
            }

            arr[i] = max;
        }

        arr[arr.length-1] = -1;

        return arr;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna