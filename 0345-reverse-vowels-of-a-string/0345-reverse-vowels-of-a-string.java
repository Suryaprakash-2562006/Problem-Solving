class Solution {
    public String reverseVowels(String s) {
        String str = "";
        char[] arr = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }

        int i = 0;
        int j = arr.length - 1;
        String vowels = "AEIOUaeiou";

        while(i < j){

            if(vowels.indexOf(arr[i]) == -1){
                i++;
            }
            else if(vowels.indexOf(arr[j]) == -1){
                j--;
            }
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        for(char x : arr){
            str += x;
        }

        return str;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna