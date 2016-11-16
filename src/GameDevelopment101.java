import java.util.Scanner;
import java.util.InputMismatchException;
public class GameDevelopment101 {
    public static void main(String[] args) {
        int randomNumber;
        int userEntry = 0;
        int guesses = 0;
        Scanner sc = new Scanner(System.in);
        randomNumber = (int) Math.floor(Math.random() * 100) + 1;
        while(userEntry != randomNumber){
            System.out.print((5-guesses) + " Guesses remaining\nGuess a number from 1 - 100: ");
            try{
                userEntry = sc.nextInt();
                if (userEntry <= 0 || userEntry > 100){
                    System.out.println("Enter a valid whole number");
                    continue;
                }
            } catch(InputMismatchException e){
                sc.next();
                System.out.println("Enter a valid whole number");
                continue;
            }
            if (userEntry > randomNumber){
                guesses++;
                System.out.println("The number is lower\n");
            } else if(userEntry < randomNumber){
                guesses++;
                System.out.println("The number is higher");
            }
            if (guesses == 5){
                break;
            }
        }
        if(guesses == 5){
            System.out.println("The number was " + randomNumber + " Game Over");
        }else{
            System.out.println("Good Guess!");
        }
    }
}
