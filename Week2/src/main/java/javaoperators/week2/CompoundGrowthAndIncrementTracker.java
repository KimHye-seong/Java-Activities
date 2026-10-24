
package javaoperators.week2;

/**
 *
 * @author _parall_el
 */
public class CompoundGrowthAndIncrementTracker {
    public static void main(String[] args) {
    // Advanced: Compound Growth & Increment Tracker
        // 1. CompoundGrowth (first bullet)
        int initialBalance = 50;
        System.out.println("\n<~=~=~=~=~=~=~=~> COMPOUND GROWTH <~=~=~=~=~=~=~=~>\n");
        System.out.println("Initial Balance: " + initialBalance);
        
        // Modify the balance with += and *= at least 3 statements, output each step
        initialBalance += initialBalance;
        System.out.println("\nAdd & Equals: " + initialBalance);
        initialBalance *= initialBalance;
        System.out.println("Multiply & Equals: " + initialBalance);
        initialBalance += initialBalance;
        System.out.println("Add & Equals: " + initialBalance);
        initialBalance *= initialBalance;
        System.out.println("Multiply & Equals: " + initialBalance);
        System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
        
        // 2. Increment Tracker (2nd and 3rd Bullet)
        int count = 67;
        System.out.println("\n<~=~> INCREMENT TRACKER <~=~>");
        System.out.printf("%15s%n", count++); // count++: This uses and prints the current value of the count first  
        System.out.printf("%15s%n", count); // the count++ behavior will now print on this line
        System.out.printf("%15s%n", ++count); // ++count: Increments and print right away
        System.out.println("<~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
    }
}
