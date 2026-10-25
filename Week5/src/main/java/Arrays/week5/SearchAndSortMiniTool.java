
package Arrays.week5;

/**
 *
 * @author _parall_el
 */
import java.util.Arrays;
public class SearchAndSortMiniTool {
    public static void main(String[] args) {
        // Advanced: Search & Sort Mini-Tool
        // Same scores array from the Intermediate: Class Statistics Calculator
        int[] scores = {90, 98, 74, 88, 75, 93, 79, 85};

        int target = 93; // change this to search for a different value

        System.out.println("\n<~=~=~=~=~> SEARCH & SORT MINI-TOOL <~=~=~=~=~>\n");

        // LINEAR SEARCH: checks each score one by one, starting from index 0
        int index = -1; // -1 means "not found yet"

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i; // save the position of the first match
                break;
            }
        }

        if (index == -1) {
            System.out.println("Target " + target + " was NOT found.");
        } else {
            System.out.println("Target " + target + " was found at index " + index + ".");
        }
        
        /*
        SORT A COPY:
        I sorted a copy instead of the original array on purpose. Arrays.sort()
        changes the array it's given, so if I sorted the original, the scores
        would be shuffled around for good. That would mess up the index I just
        found in the search, because 93 would no longer be at the same spot.
        It would also lose the original order, which could matter if each score
        belongs to a specific student. By sorting a copy, I can still show the
        sorted list while keeping my original data safe.
        */
        
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        // Arrays.toString() is needed to print the values instead of a memory address
        System.out.println("\nOriginal:    " + Arrays.toString(scores));
        System.out.println("Sorted copy: " + Arrays.toString(sortedScores));

        System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
    }
    
}
