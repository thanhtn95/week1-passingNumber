import java.util.Scanner;

public class PassingExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int size = sc.nextInt();
        if (size >= 30) {
            System.out.println("Size shouldn't go over 30");
        } else {
            int[] scores = new int[size];
            for (int i = 0; i < scores.length; i++) {
                System.out.println("Enter the score of Student " + (i + 1));
                scores[i] = sc.nextInt();
            }
            System.out.println("Scores: ");
            int count = 0;
            for (int i : scores) {
                if (i >= 5 && i <= 10) {
                    count++;
                }
                System.out.print(i + ", ");
            }
            System.out.println();
            System.out.println("The number of students passing the exam is " + count);
        }
    }
}
