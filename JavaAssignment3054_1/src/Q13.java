import java.util.Scanner;
public class Q13 {
}
//13. Java Program to Calculate the Sum of Natural Numbers up to a Certain Range

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range:");
        int range = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += i;  }
        System.out.println("Sum of natural numbers up to " + range + " is: " + sum);  }  }