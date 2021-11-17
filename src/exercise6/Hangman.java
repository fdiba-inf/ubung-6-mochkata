package exercise6;

import java.util.Scanner;
import java.util.Random;


public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        String[] words = {"Fiki" , "Malina" , "Azis"};
        int maxErrors = 5;

       boolean playAgain = true;
       do {
        int randomIndex = new Random().nextInt(words.length);
        String word = words[randomIndex];

        int nextEnteredLetterIndex = 0;

        int enteredLettersSize = word.length() + maxErrors;

        char[] enteredLetters = new char[enteredLettersSize];

        for (int index = 0; index < word.length(); index++) {
          char letter = word.charAt(index);
             boolean letterFound = false;
          for (int i = 0; i < enteredLetters.length; i++) {
            if (enteredLetters[i] == letter) {
              letterFound = true;
              break;
              
                       }
          }
          if (letterFound) {
          System.out.print(letter);
        } else {
          System.out.print(" _")
        }
        } 
        System.out.println();

        System.out.print("Enter letter: ");
      
        System.out.println("Do you want to play again (y/n): ");
        char yesOrNo = input.next().charAt(0);
        if (yesOrNo == 'n') {
          playAgain = false;
        }

       } while(playAgain);
       
       System.out.println("Session end");
    }
}