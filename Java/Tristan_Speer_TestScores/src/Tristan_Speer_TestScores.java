import java.util.*;

public class Tristan_Speer_TestScores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // scores
        double score1;
        double score2;
        double score3;

        // try statement to do some exception handling
        try {
            // inputs
            System.out.println("First test score: ");
            score1 = input.nextDouble();

            System.out.println("Second test score: ");
            score2 = input.nextDouble();

            System.out.println("Third test score");
            score3 = input.nextDouble();

            // creating object / sending to constructor
            Tristan_Speer_Worker scores = new Tristan_Speer_Worker();

            System.out.println("Letter grade: " + scores.getLetterGrade(scores.getAverageScore(score1, score2, score3)));

            System.out.println("Average: " + scores.getAverageScore(score1, score2, score3));
        }

        // catching any miscellaneous characters
        catch (InputMismatchException e){
            System.out.println("Wrong input: " + e.getMessage());
        }

    }

}