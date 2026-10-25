
package ControlFlow1DecisionMaking.week3;

/**
 *
 * @author _parall_el
 */
public class SimpleGradeClassifier {
    public static void main(String[] args) {
    // Basic: Simple Grade Classifier
        int score = 91; // score = 59, for failed   
        
        System.out.println("\n<~=~=~=~=~=~=~=~=~> SIMPLE GRADE CLASSIFIER <~=~=~=~=~=~=~=~=~>\n");
        if(score >= 60){
            System.out.println("Student score is " + score + ", therefore...");
            System.out.println("Student Status: PASSED");
        }else{
            System.out.println("Student score is " + score + ", therefore...");
            System.out.println("Student Status: FAILED");
        }
        System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
    }
}
