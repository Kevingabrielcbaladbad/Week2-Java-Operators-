public class Main {
    public static void main(String[] args) {

        double AverageGrade = 85.75;
        int Absences = 2;
        boolean eligible = (AverageGrade >= 75 && Absences <= 3)
        || (AverageGrade >= 90);

        System.out.println("===== Grade Threshold Checker =====");
        System.out.println("Average Grade: " + AverageGrade);
        System.out.println("Number of Absences: " + Absences);
        
        if (eligible) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        
        if (AverageGrade >= 90) {
            System.out.println("Reason: Scored 90+ regardless of absences.");
        } else if (AverageGrade >= 75 && Absences <= 3) {
            System.out.println("Reason: The grade must be 75 or higher, with no more than 3 absences.");
        } else {
            System.out.println("Reason: The student did not pass because the requirements were not met.");
            
        }
    }
}