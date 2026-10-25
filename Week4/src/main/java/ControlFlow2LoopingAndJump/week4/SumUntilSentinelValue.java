
package ControlFlow2LoopingAndJump.week4;

/**
 *
 * @author _parall_el
 */
import java.util.Scanner;
public class SumUntilSentinelValue {
    public static void main(String[] args) {
        // Intermediate: Sum Until Sentinel Value
        Scanner jarvis = new Scanner(System.in);
        int num = 0, total = 0;
        
            System.out.println("~=~=~=~=~=~=~=~=~=~=~ SUM UNTIL SENTINEL VALUR ~=~=~=~=~=~=~=~=~=~=~");
            System.out.println("Enter positive integers to accumulate the sum.");
            System.out.println("TakeNote: Entering -1 will stop the loop and show the total");
        while(true){
            System.out.print("Enter a number: ");
            num = jarvis.nextInt();
            if(num == -1)break;
            
            total += num;
        }
        System.out.println("Total: " + total);
        System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
    }
    
}
