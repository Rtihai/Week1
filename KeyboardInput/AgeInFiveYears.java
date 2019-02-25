package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String name = input.nextLine();
        System.out.println("Hi, "+ name + "!" + " How old are you?");
        int age = input.nextInt();
        int agePlus = age + 5;
        int ageMinus = age - 5;
        System.out.println("Did you know that in five years you will be " + agePlus + " years old?\n" +
                            "And five years ago you were " + ageMinus + "!" + " Imagine that!");
    }
}
