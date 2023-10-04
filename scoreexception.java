package ScoreException.java;
public class ScoreException extends Exception {
    public ScoreException(String message) {
        super(message);
    }
}


Testscore.java
import java.util.Scanner;
import ScoreException.*;

public class TestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 5;
        String[] studentIDs = new String[numStudents];
        int[] scores = new int[numStudents];

        studentIDs[0] = "ID001";
        studentIDs[1] = "ID002";
        studentIDs[2] = "ID003";
        studentIDs[3] = "ID004";
        studentIDs[4] = "ID005";

        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter a test score for student " + studentIDs[i] + ": ");
            try {
                int score = Integer.parseInt(scanner.nextLine());
                if (score < 0 || score > 100) {
                    throw new ScoreException("Invalid score. Please enter a score between 0 and 100.");
                }
                scores[i] = score;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric score.");
                scores[i] = 0;
            } catch (ScoreException e) {
                System.out.println(e.getMessage());
                scores[i] = 0;
            }
        }

        System.out.println("\nStudent IDs and Scores:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student ID: " + studentIDs[i] + ", Score: " + scores[i]);
        }
    }
}
