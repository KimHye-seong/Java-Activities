
package Arrays.week5;

/**
 *
 * @author _parall_el
 */
public class ClassStatisticsCalculator {
    public static void main(String[] args) {
        // Intermediate: Class Statistics Calculator
        int[] studentScores = {90, 98, 74, 88, 75, 93, 79, 85};
        int sum = 0, highest = studentScores[0], lowest = studentScores[0];
        double average = 0.00;
        
        for(int i = 0; i < studentScores.length; i++){
            sum += studentScores[i];
            
            if(studentScores[i] > highest){
                highest = studentScores[i];
            }
            
            if(studentScores[i] < lowest){
                lowest = studentScores[i];
            }
        }
        
        average = (double)sum / studentScores.length;
        
        System.out.println("<~=~> CLASS STATISTICS CALCULATOR <~=~>");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>");
    }
    
}
