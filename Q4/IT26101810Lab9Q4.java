import java.util.*;

public class IT26101810Lab9Q4{

    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
    }

    public static char findGrade(double finalMark) {

        if (finalMark >= 75) {
            return 'A';
        }
        else if (finalMark >= 60) {
            return 'B';
        }
        else if (finalMark >= 50) {
            return 'C';
        }
        else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-10s %-12.2f %c%n", name, finalMark, grade);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            double assignment = sc.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            double exam = sc.nextDouble();

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrade(finalMarks[i]);
        }

        System.out.println();
        System.out.println("Name       Final Mark   Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}