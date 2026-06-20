class Solution {
    public boolean checkIfPangram(String sentence) {

        int[] alp = new int[26];


        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            alp[ch - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(alp[i] == 0){
                return false;
            }
        }

        return true;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna