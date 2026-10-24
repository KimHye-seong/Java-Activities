
package javaoperators.week2;

import java.util.Scanner;
/**
 *
 * @author _parall_el
 */
public class GradeThresholdChecker {
    public static void main(String[] args) {
    // Intermediate: Grade Threshold Checker
        Scanner jarvis = new Scanner(System.in);
        double studentAvg = 89.00; // Other options: 90 for greater than 90, and 72 for failubg
        int numofAbsences = 1; //Other Option: 4
        
        System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~> GRADE THRESHOLD CHECKER <~=~=~=~=~=~=~=~=~=~=~>\n");
        System.out.println("Student's avaerage grade: " + studentAvg);
        System.out.println("Student's number of absences: " + numofAbsences);
        
        if((studentAvg >= 75 && numofAbsences <= 3) || studentAvg >= 90){
            System.out.println("Student Status: PASSED");
            if(studentAvg >= 90){
                System.out.println("Reason: The average grade is 90 or above, so absences do not matter.");
                System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
            }else{
                System.out.println("Reason: The average grade is at least 75 and absences are 3 or fewer.");
                System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
            }
        }else{
            System.out.println("Student Status: FAILED");
            if(studentAvg < 75){
                System.out.println("Reason: The average grade is below 75.");
                System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
            }else{
                System.out.println("Reason: The average grade is below 90 and absences exceed 3.");
                System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
            }
        }
    }
    
}
