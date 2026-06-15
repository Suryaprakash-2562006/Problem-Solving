class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        
        int sum = 0;
        
        for(int i=0;i<a.length;i++){
            sum += a[i][i];
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<b.length;i++){
            if(b[i] > max){
                max = b[i];
            }
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(sum);
        arr.add(max);
        
        return arr;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna