package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
        String name = input.nextLine();
        System.out.println("Ok, " + name + " how old are you?");
        int age = input.nextInt();

        if (age <= 15) {
            System.out.println("You can't drive.");
        } else if (age <= 17) {
            System.out.println("You can drive but not vote.");
        } else if (age <= 24) {
            System.out.println("You can vote but not rent a car.");
        } else if (age < 26) {
            System.out.println("You can do pretty much anything.");
        }
        else {
            System.out.println("Error, try again!");
        }
    }
}
