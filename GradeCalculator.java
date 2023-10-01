import java.util.Scanner;

public class GradeCalculator {
    public int sum(int sub1, int sub2, int sub3, int sub4, int sub5) {
        return (sub1 + sub2 + sub3 + sub4 + sub5);
    }
    public double percentage(int totalMarks, int totalSubject) {
        return (totalMarks / (double) totalSubject);
    }
    public static void main(String[] args) {
        int totalSub = 5;
        GradeCalculator obj = new GradeCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the marks of English");
        int englishMarks = sc.nextInt();

        System.out.println("Please Enter the marks of Physics");
        int physicsMarks = sc.nextInt();

        System.out.println("Please Enter the marks of Chemistry");
        int chemistryMarks = sc.nextInt();

        System.out.println("Please Enter the marks of Biology");
        int biologyMarks = sc.nextInt();

        System.out.println("Please Enter the marks of Mathematics");
        int mathMarks = sc.nextInt();

        int sum = obj.sum(englishMarks,physicsMarks, chemistryMarks, biologyMarks, mathMarks);
        System.out.println("================================================================");

        System.out.println("Obtain Marks : " +sum);
        double percentage = obj.percentage(sum, totalSub);
        System.out.println("Obtained percentage : "+percentage);
        if (percentage >= 75) {
            System.out.println("Grade Obtained : A+");
        }
        else if(percentage >= 60) {
            System.out.println("Grade Obtained : A");
        }
        else if(percentage >= 50) {
            System.out.println("Grade Obtained : B");
        }
        else if (percentage >= 40) {
            System.out.println("Grade Obtained : C");
        }
        else {
            System.out.println("Your grade is below C. Please try again");
        }
        System.out.println("================================================================");
    }
}