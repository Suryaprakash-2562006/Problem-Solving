class Solution {

    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        // Your code here
        A.add(x);

        // Just add, don't print anything
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {

        
        // Your code here
        // Just sort, don't print anything
        
        Collections.sort(A);

    }

        
    public static void reverse_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Just reverse, don't print anything
        
       Collections.reverse(A);
        
        
    }
        

    public static int size_Of_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Return the size of ArrayList
        
        return A.size();
        
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        // Your code here

        
        // Just sort in desc order, don't print anything
        
        Collections.sort(A,Collections.reverseOrder());
        
        
        
        
    }

    public static void print_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Print the elements of A, don't add new line
        
        for(int x : A){
            System.out.print(x + " ");
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna