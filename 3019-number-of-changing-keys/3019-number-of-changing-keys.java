class Solution {
    public int countKeyChanges(String s) {

        String str = s.toLowerCase();

        char[] ch = str.toCharArray();
        int count = 0;
        
        for(int i=0;i<ch.length-1;i++){
            if((ch[i] - 'a') != (ch[i+1] - 'a'))
            {
                count++;
            }
        }

        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna