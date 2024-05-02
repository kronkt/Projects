import java.util.InputMismatchException;

public class Tristan_Speer_Worker {

    // score initialization
    private double score1;
    private double score2;
    private double score3;

    public Tristan_Speer_Worker() {

        score1 = 0;
        score2 = 0;
        score3 = 0;

    }

    // constructor
    public Tristan_Speer_Worker(double s1, double s2, double s3) {

        score1 = s1;
        score2 = s2;
        score3 = s3;

    }

    public double getAverageScore(double s1, double s2, double s3) {

        score1 = s1;
        score2 = s2;
        score3 = s3;

        // returning average
        return (score1 + score2 + score3) / 3.0;

    }

    public char getLetterGrade(double average) {

        if (average >= 90.0 && average <= 100.0) {
            return 'A';
        }
        else if (average >= 80.0 && average <= 90.0) {
            return 'B';
        }
        else if (average >= 70 && average <= 79.0) {
            return 'C';
        }
        else if (average >= 60.0 && average <= 69.0){
            return 'D';
        }
        else if (average < 60.0){
            return 'F';
        }
        else{
            throw new InputMismatchException("null");
        }

    }
    
}