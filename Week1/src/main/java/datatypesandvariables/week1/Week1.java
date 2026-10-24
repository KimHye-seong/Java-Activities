
package datatypesandvariables.week1;

/**
 *
 * @author _parall_el
 */
public class Week1 {
    public static void main(String[] args) {
// Basic: Personal Profile Printer
            String name = "Gamba, Elgave M.";
            int age = 19;
            double height = 1.68;
            char initial = 'G';
            boolean studentStatus = true;
        
            System.out.println("\n<~=~=~=~=~=~=~> PERSONAL PROFILE PRINTER <~=~=~=~=~=~=~>\n");
            System.out.println("\tStudent Name:\t\t" + name);
            System.out.println("\tAge:\t\t\t" + age);
            System.out.println("\tHeight(Meters):\t\t" + height);
            System.out.println("\tName Initial:\t\t" + initial);
            System.out.println("\tStatus(Is Enrolled):\t" + studentStatus);
            System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=>\n");

// Intermediate: Type-Safe Shopping Calculator
            // 1. Variable Declaration
            int quantity = 7;
            double unitPrice = 10.87;
            String storeName = "Code Tech Corner";

            // 2. Total Cost Calcculation
            double totalCost = quantity * unitPrice;

            // 3. Print
            System.out.println("\n<~=~=~=~=~=~=~=~> ITEMIZED SUMMARY <~=~=~=~=~=~=~=~>\n");
            System.out.println("\tStore Name:\t" + storeName);
            System.out.println("\tQuantity:\t" + quantity);
            System.out.println("\tUnit Price:\t" + unitPrice);
            System.out.println("\tTotal:\t\t" + totalCost);
            System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=>\n");

            /*
                Total Cost Explanation: 
                totalCost should NOT be declared as an int because multiplying an integer (quantity)
                by a floating-point number (unitPrice, which is a double) results in a double value. 
                Declaring totalCost as an int would require explicit type casting and cause a loss 
                of precision by truncating the fractional/decimal portion of the price.
            */
        
// Advanced: Unit Casting Converter
            // 1. Variable Declaration
            double centimeters = 557.34;

            // 2. Using explicit casting
            int meters = (int)(centimeters / 100);
            double remainingCentimeters = centimeters % 100;

            System.out.println("\n<~=~> CENTIMETER-TO-METER CONVERTER <~=~>\n");
            System.out.println("Centimeter/s: " + centimeters + " cm");
            System.out.printf("Meter/s: %d m and %.2f cm%n", meters, remainingCentimeters);
            System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");

            // 3. Demonstration of Implicit Widening and Explicit Narrowing
            int num1 = 67;
            double impWide = num1;
            /*
            Explanation: No explicit cast is required because Java automatically converts 
            a smaller data type (int) to a larger data type (double) without risk of data loss.
            */

            double num2 = 67.99;
            int expNarrow = (int)num2;
            /*
            Explanation: An explicit cast (int) is required because converting a double to an int 
            is a narrowing conversion. The fractional/decimal part (.99) is completely truncated (removed),
            resulting in data loss.
            */

            System.out.printf("%-45s%-45s%n", "\n<~=~=~> IMPLICIT WIDENING EXAMPLE <~=~=~>", "<~=~=~> EXPLICIT WIDENING EXAMPLE <~=~=~>\n");
            System.out.printf("%-45s%-45s%n", "Original Int: " + num1, "Original Double: " + num2);
            System.out.printf("%-45s%-45s%n", "Widened double: " + impWide, "Narrowed Int: " + expNarrow);
            System.out.printf("%-45s%-45s%n", "\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>", "<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
        
// Expert: Overflow & Reference Investigator
            // 1st Bullet
            short overflowing = 32767;
            overflowing++; // increment, which is the wrapping part
            
            System.out.println("\n<~=~=~> OVERFLOW & REFERENCE INVESTIGATOR <~=~=~>\n");
            System.out.println("Primitive Data Type[Short]: " + overflowing + "\n"); 
            // unexpected result because 32,767 is the max range for short
            // so if wanting to increase more it will go back to short's min range
            
            String str1 = new String("Parallel");
            String str2 = new String("Parallel");
            String str3 = "Parallel";
            
            // 2nd and 3rd Bullet
            System.out.println("String1 == String2: \t " + (str1 == str2)); // false: since str1 uses new keyword, it forces to create different string object
            System.out.println("String1 == String3: \t " + (str1 == str3)); // false: == only compares references not text content of object
            System.out.println("String1.equals(String2): " + str1.equals(str2)); // true: .equals() method can compare the actual text content of the objects
            System.out.println("String1.equals(String3): " + str1.equals(str3)); // true: can compare the actual text content
            System.out.println("String2 == String3: \t " + (str2 == str3)); // false: same with the first comparison
            System.out.println("String2.equals(String3): " + str2.equals(str3)); // true: same with the previous true output
            
            // 4th Bullet
            int[] arr1 = {87, 79, 95, 100};
            int[] arr2 = arr1;
            
            System.out.println("\nSet 1: " + arr1[0] +  ", " + arr1[1] + ", " + arr1[2] + ", " + arr1[3]);
            System.out.println("Set 2: " + arr2[0] +  ", " + arr2[1] + ", " + arr2[2] + ", " + arr2[3]);
            
            // Modify
            arr2[1] = 81;
            
            // print the update
            System.out.println("\nSet 2[element 2]: 81");
            System.out.println("\nSet 1: " + arr1[0] +  ", " + arr1[1] + ", " + arr1[2] + ", " + arr1[3]);
            System.out.println("Set 2: " + arr2[0] +  ", " + arr2[1] + ", " + arr2[2] + ", " + arr2[3]);
            
            // Modify
            arr1[3] = 98;
            
             // print the update
            System.out.println("\nSet 1[element 4]: 98");
            System.out.println("\nSet 1: " + arr1[0] +  ", " + arr1[1] + ", " + arr1[2] + ", " + arr1[3]);
            System.out.println("Set 2: " + arr2[0] +  ", " + arr2[1] + ", " + arr2[2] + ", " + arr2[3]);
            System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
    }
}
