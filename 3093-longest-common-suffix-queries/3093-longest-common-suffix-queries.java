class Solution {

    class Node {
        Node[] next = new Node[26];
        int index = -1;
    }

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        Node root = new Node();

        int small = 0;

        for(int i=1;i<wordsContainer.length;i++){
            if(wordsContainer[i].length() < wordsContainer[small].length()){
                small = i;
            }
        }

        root.index = small;

        for(int i=0;i<wordsContainer.length;i++){

            Node cur = root;
            String w = wordsContainer[i];

            for(int j=w.length()-1;j>=0;j--){

                int x = w.charAt(j) - 'a';

                if(cur.next[x] == null){
                    cur.next[x] = new Node();
                }

                cur = cur.next[x];

                if(cur.index == -1 ||
                   wordsContainer[i].length() < wordsContainer[cur.index].length()){
                    cur.index = i;
                }
            }
        }

        int[] ans = new int[wordsQuery.length];

        for(int i=0;i<wordsQuery.length;i++){

            Node cur = root;
            int best = root.index;

            String q = wordsQuery[i];

            for(int j=q.length()-1;j>=0;j--){

                int x = q.charAt(j) - 'a';

                if(cur.next[x] == null){
                    break;
                }

                cur = cur.next[x];
                best = cur.index;
            }

            ans[i] = best;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna