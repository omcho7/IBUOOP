package org.example;
import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        int noGuesses = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number: ");
        while (true) {


            int guess = Integer.parseInt(sc.nextLine());

            if (guess == randomNumber) {
                System.out.println("You are correct!");
                System.out.println("You made " + noGuesses + " guesses!"
                );
            }
            else if(guess > randomNumber) {
                noGuesses++;
                System.out.println("Lower! - This is your " + noGuesses + ". guess!");
                continue;
            }
            else {
                noGuesses++;
                System.out.println("Higher! - This is your " + noGuesses + ". guess!");
                continue;
            }
        }


    }
}
