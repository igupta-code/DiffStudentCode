import java.sql.SQLOutput;

/**
 * Plagiarism Checker
 * A tool for finding the longest shared substring between two documents.
 *
 * @author Zach Blick
 * @author Isha Gupta
 */
public class PlagiarismChecker {

    /**
     * This method finds the longest sequence of characters that appear in both texts in the same order,
     * although not necessarily contiguously.
     * @param doc1 the first document
     * @param doc2 the second
     * @return The length of the longest shared substring.
     */
    public static int longestSharedSubstring(String doc1, String doc2) {
        int[][] table = new int[doc1.length()+1][doc2.length()+1];
        int maxL = 0;

        for(int i = 1; i < doc1.length()+1; i++){
            for(int j = 1; j < doc2.length()+1; j++){
                table[i][j] = table[i][j-1];

                // Look for letter you're adding in the other string (if you can't find it move on)
                char c = doc2.charAt(j-1);

                // Go through other array looking for c
                for(int k = i; k > 0; k--){
                    if(doc1.charAt(k-1) == c){
                        // Look at the square that corresponds to the smaller problem and add one
                        maxL = Math.max(table[k - 1][j - 1]+1, table[i][j]);
                        table[i][j] = maxL;
                        break;
                    }
                }
            }
        }
        return maxL;
    }
}
