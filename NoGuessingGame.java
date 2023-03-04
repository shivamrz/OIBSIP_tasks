import java.util.*;
public class NoGuessingGame
{
    public static void main(String args[]) 
    {
        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);           
        Scanner userInput = new Scanner(System.in);
        System.out.println("**Welcome to Number Guessing Game**");
        System.out.print("Enter number of attempt you want to take to guess the game:");
        int Atmpt=userInput.nextInt();
        System.out.println("You have Maximum "+Atmpt+" Attemp Limit");
        do {
            System.out.print("Enter a guess number between 1 to 100:");
            if(userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();
                if (userGuessNumber == secretNumber)
                {    
                    System.out.println("Hurray!!!, You cracked it.");
                    break;
                }
                else if (userGuessNumber < secretNumber)
                    System.out.println("Your Guess Number is Smaller.");
                else if (userGuessNumber > secretNumber)
                    System.out.println("Your Guess Number is Greater.");
                if(attempt == Atmpt) {
                    System.out.println("You have exceeded the maximum attempt. Try Again");
                    break;
                }
                attempt++;
            }else {
                System.out.println("Enter a Valid Integer Number!!!");
                break;
            }
        } while (userGuessNumber != secretNumber);
    }
}