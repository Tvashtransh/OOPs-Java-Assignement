import java.util.Scanner;
public class Q7 {
}
// 7. Java Program for Grading System Based on Percentage

class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage:");
        double percentage = sc.nextDouble();
        if (percentage >= 90) { System.out.println("Grade A"); }
         else if (percentage >= 80) { System.out.println("Grade B"); }
            else if (percentage >= 70) { System.out.println("Grade C"); }
            else if (percentage >= 60) { System.out.println("Grade D"); }
            else if (percentage >= 40) { System.out.println("Grade E"); }
            else { System.out.println("Grade F"); }  }  }
