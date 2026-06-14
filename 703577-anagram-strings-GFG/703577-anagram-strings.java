// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        
        if(S2.length() != S1.length()) return 0;
        
        int s[] = new int[26];
        
        for(int i=0;i<S1.length();i++){
            char ch = S1.charAt(i);
            s[S1.charAt(i) - 'a']++;
            s[S2.charAt(i) - 'a']--;
        }
        
        for(int x : s){
            if(x != 0){
                return 0;
            }
        }
        
        return 1;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna