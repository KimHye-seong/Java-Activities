
package javaoperators.week2;

/**
 *
 * @author _parall_el
 */
public class PrecedencePuzzleSolver {
    public static void main(String[] args) {
    // Expert: Precedence Puzzle Solver
        int x = 5, y = 7;
        
        System.out.println("\n<~=~=~> PRECEDENCE PUZZLE SOLVER <~=~=~>\n");
        // first expression...
        // PREDICTED: false
        System.out.println((x * y == y && ++y / 4 <= x) || y * 3 <= x - x);
        
        // second expression...
        //PREDICTED: 9
        System.out.println(x * (--y / 3) - y + x++);
        
        // third expression...
        // PREDICTED: true
        System.out.println(x * x > y * --x || (y - x <= 1 && y / 4 > x));
        System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
    }
}
