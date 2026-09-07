class Solution {
    public String mergeAlternately(String word1, String word2) {

        int len = word1.length() + word2.length();
        String str[] = new String[len];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < word1.length() || j < word2.length()) {

            if (i < word1.length()) {
                str[k] = String.valueOf(word1.charAt(i));
                i++;
                k++;
            }

            if (j < word2.length()) {
                str[k] = String.valueOf(word2.charAt(j));
                j++;
                k++;
            }
        }

        String st = "";

        for (String s : str) {
            st += s;
        }

        return st;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna