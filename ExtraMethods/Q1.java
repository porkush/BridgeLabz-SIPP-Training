// 1. Number Guessing Game:
// ○ Write a Java program where the user thinks of a number between 1 and 100, and
// the computer tries to guess the number by generating random guesses.
// ○ The user provides feedback by indicating whether the guess is high, low, or
// correct. The program should be modular, with different functions for generating
// guesses, receiving user feedback, and determining the next guess.

package ExtraMethods;

import java.util.Scanner;

public class Q1 {
    public static int Randoms(int high, int low){
        return (low+ high)/2;
    }    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int low=1;
        int high=100;
        int guess;
        String feedback="";
        System.out.println("think of a number between 1 and 100");
        System.out.println("I will try to guess it.");
        System.out.println("Type 'high' if my guess is too high, 'low' if too low, 'correct' if I got it.");
        while (true) {
            guess= Randoms(high, low);
            System.out.println("is your number" + guess + "?");
            feedback= sc.next().toLowerCase();
            if(feedback.equals("correct")){
                System.out.println("we guessed correct");
                break;
            }
            else if(feedback.equals("high")){
                high= guess-1;
            }
            else if(feedback.equals("low")){
                low= guess+1;
            }
            else{
                System.out.println("invalid input, please enter 'low', high, 'correct'");
            }
        
        if(low>high){
            System.out.println("please enter correct feedback");
            continue;
        }
    }
        }
    }
    

