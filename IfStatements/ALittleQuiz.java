package Week1.IfStatements;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready for a quiz? (yes/no)");
        String justStart = input.nextLine();

        if (justStart.equals("yes")) {
            System.out.println("Okay, here it comes!\n");
        } else {
            System.out.println("Common! You can do it!\n");
        }

        int rightAnswer = 0;
        int wrongAnswer = 0;

        System.out.println("Q1: What is the capital of Alaska?\n" +
                "1) Melbourne \n2) Anchorage\n3) Juneau");
        int q1 = input.nextInt();
        if (q1 == 3) {
            System.out.println("That's right!\n");
            rightAnswer++;
        } else {
            System.out.println("Sorry, wrong!\n");
            wrongAnswer++;
        }

        System.out.println("Q2: Can you store the value \"cat\" in a variable of type int?\n" +
                            "1) yes\n2) no");
        int q2 = input.nextInt();
        if (q2 == 2) {
            System.out.println("Yes, you are write!\n");
            rightAnswer++;
        } else {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.\n");
            wrongAnswer++;
        }

        System.out.println("Q3: What is the result of 9+6/3?\n" +
                "1) 5 \n2) 11\n3) 15/3");
        int q3 = input.nextInt();
        if (q3 == 2) {
            System.out.println("That's right!\n");
            rightAnswer++;
        } else {
            System.out.println("Sorry, you are wrong!\n");
            wrongAnswer++;
        }

        System.out.println("Overall, you got " + rightAnswer + " right answers and " + wrongAnswer + " wrong answer.\n" +
                            "Thanks for playing!");
    }
}
