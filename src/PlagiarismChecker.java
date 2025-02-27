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

        // For a tabulation approach, go through both arrays
        for(int i = 1; i < doc1.length() + 1; i++){
            for(int j = 1; j < doc2.length() + 1; j++){
                // If it matches find the longest sequence if you take out the matching letter, and add + 1
                if(doc1.charAt(i-1) == doc2.charAt(j-1)){
                    table[i][j] = table[i-1][j-1] + 1;
                }
                else{
                    // Set your position to the max of the numbers above / to the left of you
                    table[i][j] = Math.max(table[i][j-1], table[i-1][j]);
                }
            }
        }
        // Return the longest substring of both strings
        return table[doc1.length()][doc2.length()];
    }
}
