
package ControlFlow2LoopingAndJump.week4;

/**
 *
 * @author _parall_el
 */
public class PatternGeneratorWithEarlyExit {
    public static void main(String[] args) {
        // Advanced: Pattern Generator with Earch Exit
        int size = 7;

        System.out.println("\n<~=~> PATTERN GENERATOR WITH EARLY EXIT <~=~>\n");

        // Outer loop controls the rows of the triangle
        for(int r = 1; r <= size; r++){

            // CONTINUE: skips row 7 (the last row), so nothing is printed for it
            if(r == 7){
                continue;
            }

            // Inner loop is set to run up to size
            for(int c = 1; c <= size; c++){

                // BREAK: stops the INNER loop early once c goes past the current row number
                if(c > r){
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
    }
}
