class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1){
                ar.add(arr[i]);
            }
        }
        
        return ar;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna