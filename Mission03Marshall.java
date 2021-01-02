import java.util.Scanner;
import java.util.Random;

// this program will create a random number and ask a user to guess

public class Mission03Marshall
{
   public static void main(String[] args)
   {
      int userNum; //declares integer
      int number; //declares integer
      int userGuess = 0; //declares integer and sets accumulator to 0
      
      Scanner keyboard = new Scanner(System.in); 
      
      Random randomNumbers = new Random(); //intitializes randomNumbers and creates a random numbers
      number = randomNumbers.nextInt(100) + 1;
      
      System.out.println("Welcome to the Higher/Lower game. Try to guess the number between 1 and 100.");
      
      do      
      {
         System.out.println("Enter your guess."); //output
         userNum = keyboard.nextInt(); //reads input
         userGuess++;
            
             
            if (userNum < 1 || userNum > 100){
               System.out.println("Error! Please enter a number between 1-100.");
            }
            else if (userNum < number){
               System.out.println("OOPS! That guess is too low. Please try again!");
            }
         
            else if (userNum > number){
               System.out.println("OOPS! That guess is too high. Please try again!");
            }         
            else if (userNum == number){
               System.out.println("The number is " + number + "! You guessed correctly! It took you " 
                                          + userGuess + " tries."); 
            }
      }
      
      while (userNum != number);       
   }
}
             
      
      
      
      
      
      