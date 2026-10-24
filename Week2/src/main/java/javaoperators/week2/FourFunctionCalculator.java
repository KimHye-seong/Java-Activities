
package javaoperators.week2;

import java.util.Scanner;
/**
 *
 * @author _parall_el
 */
public class FourFunctionCalculator {
    public static void main(String[] args) {
    // Basic: Four-Function Calculator
        Scanner jarvis = new Scanner(System.in);
        // 1. User data entry
        System.out.println("\n<~=~=~=~=~=~=~=~> FOUR-FUNCTION CALCULATOR <~=~=~=~=~=~=~=~>\n");
        System.out.print("Enter first integer: ");
        int num1 = jarvis.nextInt(); 
        System.out.print("Enter second integer: ");
        int num2 = jarvis.nextInt();
        
        // 2. Calculation
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double)num1 / num2;
        int remainder = num1 % num2;
        
        // 3. Result
        System.out.println("Addition:\t\t" + sum);
        System.out.println("Subtraction:\t\t" + difference);
        System.out.println("Multiplication:\t\t" + product);
        System.out.println("Division:\t\t" + (quotient % 1 == 0 ? (int)quotient : quotient));
        System.out.println("Modulus:\t\t" + remainder);
        /*
            Division and Modulus behave differently with negativee operands.
            - Division truncates toward zero (-7 / 2 = -3).
            - Modulus takes the sign of the first operand (-7 % 2 = -1, 7 % -2 = 2).
        */
        System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~x>\n");
    }
    
}
