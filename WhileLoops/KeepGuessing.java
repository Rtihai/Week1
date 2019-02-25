package Week1.WhileLoops;

import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x = 5;
        System.out.println("I have chosen a number between 1 and 10. Try to guess it...");
        int number = keyboard.nextInt();
        while(number!=x){
            System.out.print("That is incorrect. Guess again from 1 to 10:");
            number = keyboard.nextInt();
            if(number==x){
                System.out.print("That's right!  You\'re a good guesser.");
            }
        }
    }
}
