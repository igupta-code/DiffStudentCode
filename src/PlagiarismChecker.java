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
        int[][] table = new int[doc1.length() + 1][doc2.length() + 1];

        for(int i = 0; i < doc1.length(); i++){
            for(int j = 0; j < doc2.length(); j++){
                // Look for letter you're adding in the other string (if you can't find it move on)

                // Look at the square that corresponds to the smaller problem and add one

                // Check previous highest number to make sure that's not bigger + update
            }
        }


        return 0;
    }
}
