
package Arrays.week5;

/**
 *
 * @author _parall_el
 */
public class ClassRankingSystem {
    // Expert: Class Ranking System
    static void sortStudents(Student[] students){
        for(int i = 0; i < students.length - 1; i++){
            int best = i;

            for(int j = i + 1; j < students.length; j++){
                if (isBetter(students[j], students[best])){
                    best = j;
                }
            }
            
            Student temp = students[i];
            students[i] = students[best];
            students[best] = temp;
        }
    }
    
    static boolean isBetter(Student a, Student b){
        if(a.getTotal() != b.getTotal()){
            return a.getTotal() > b.getTotal();
        }
        return a.name.compareTo(b.name) < 0;
    }
    
    static int[] computeRanks(Student[] sorted){
        int[] ranks = new int[sorted.length];
        ranks[0] = 1;

        for(int i = 1; i < sorted.length; i++){
            if(sorted[i].getTotal() == sorted[i - 1].getTotal()){
                ranks[i] = ranks[i - 1]; 
            }else{
                ranks[i] = i + 1;        
            }
        }
        return ranks;
    }
    
    static int findRank(Student[] sorted, int[] ranks, String target){
        for(int i = 0; i < sorted.length; i++){
            if(sorted[i].name.equals(target)){ 
                return ranks[i];
            }
        }
        return -1; // not found
    }
    
    static void printLeaderboard(Student[] sorted, int[] ranks){
        System.out.printf("%-6s %-15s %7s%n", "Rank", "Name", "Average");
        System.out.println("--------------------------------");

        for(int i = 0; i < sorted.length; i++){
            boolean tiedWithPrevious = i > 0 && ranks[i] == ranks[i - 1];
            boolean tiedWithNext = i < sorted.length - 1 && ranks[i] == ranks[i + 1];
            String tieLabel = (tiedWithPrevious || tiedWithNext) ? "  (tie)" : "";

            System.out.printf("%-6d %-15s %7.2f%s%n",
                    ranks[i], sorted[i].name, sorted[i].getAverage(), tieLabel);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("\n<~=~=~> CLASS RANKING SYSTEM <~=~=~>\n");

        String[] names = {"EL", "Kim Hye-seong", "parallel", "Melior Zane", "Gamba"};
        int[][] rawScores = {
            {90, 85, 88, 92},  // EL = 88.75
            {78, 82, 80, 76},  // Kim Hye-seong = 79.00
            {95, 91, 89, 93},  // parallel = 92.00
            {85, 90, 88, 92},  // Melior Zane = 88.75 (ties with EL)
            {70, 75, 72, 68}   // Gamba = 71.25
        };

        Student[] students = new Student[names.length];
        for(int i = 0; i < names.length; i++){
            students[i] = new Student(names[i], rawScores[i]);
        }

        sortStudents(students);                
        int[] ranks = computeRanks(students);    
        printLeaderboard(students, ranks);

        System.out.println();
        String[] targets = {"parallel", "Formosa"};
        for(int i = 0; i < targets.length; i++){
            int rank = findRank(students, ranks, targets[i]);
            if(rank == -1){
                System.out.println("Rank of " + targets[i] + ": not found");
            }else{
                System.out.println("Rank of " + targets[i] + ": " + rank);
            }
        }

        System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
    }
}

class Student{
    String name;
    int[] quizzes;

    Student(String name, int[] quizzes){
        this.name = name;
        this.quizzes = quizzes;
    }

    int getTotal() {
        int total = 0;
        for (int i = 0; i < quizzes.length; i++) {
            total += quizzes[i];
        }
        return total;
    }

    double getAverage() {
        return (double) getTotal() / quizzes.length;
    }
}
