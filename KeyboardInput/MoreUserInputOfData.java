package Week1.KeyboardInput;

import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the following information so I can sell it for a profit!\n");
        System.out.println("First name: ");
        String firsName = input.nextLine();
        System.out.println("Last name: ");
        String lastName = input.nextLine();
        System.out.println("Grade (9-12): ");
        int grade = input.nextInt();
        System.out.println("Student ID: ");
        int studentId = input.nextInt();
        input.nextLine(); // will consume the newline(\n) character that's left from the previous
        System.out.println("Login name: ");
        String loginName = input.nextLine();
        System.out.println("GPA (0.0 to 4.0) ");
        double gpa = input.nextDouble();

        System.out.println("Your information:");
        System.out.println("Login: " + loginName);
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + firsName + "," + lastName);
        System.out.println("GPA (0.0 to 4.0): " + gpa);
        System.out.println("Grade (9-12): " + grade);
    }
}
