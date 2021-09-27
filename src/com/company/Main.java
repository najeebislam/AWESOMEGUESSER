package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        //int rNumber = 6;
        int rNumber = random.nextInt(100) + 1;
        //System.out.println(rNumber);
        System.out.println("Guess number between 0 and 100!");
        long startTime = System.nanoTime() / 1000000000;

        int Guess = input.nextInt();
        int numberOfGuesses = 1;
        while (Guess != rNumber) {
            System.out.println("You fool! You got it wrong please try again!");
            numberOfGuesses++;
            int diff1 = Math.abs(rNumber - Guess);
            Guess = input.nextInt();
            int diff2 = Math.abs(rNumber - Guess);
            if (diff1 > diff2 && diff1 != rNumber) {
                System.out.println("Guess was warmer");
            } else if (diff2 > diff1) {
                System.out.println("Guess was colder");
            } else if (diff1 == diff2) {
                System.out.println("Guess was the same distance away");
            }


        }
        if (numberOfGuesses <= 1) {
            System.out.println("Well done you guessed my number");
            System.out.println("You guessed it first time!!!!!");
        }else {
            System.out.println("Well done! You guessed my number!");
            System.out.println("It took you " + numberOfGuesses + " tries!");
        }
        long endTime = System.nanoTime() / 1000000000;
        long seconds = endTime - startTime;
        System.out.println("It took "+(endTime - startTime) + " seconds!");
        if(seconds <= 20) {
            System.out.println("You were very quick!");

        }else if(seconds <= 40) {
            System.out.println("You were at a mediocre speed!");
        }else if(seconds > 40) {
            System.out.println("Poor performance! You were incredibly slow and need to rethink your life choices!");
        }


    }



}
