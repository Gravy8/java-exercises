import java.util.Scanner;
import java.util.Random;
public class Methods {
    public static void main(String[] args) {
        //System.out.println(add(5,5));
        //System.out.println(subtract(10,5));
        //System.out.println(multiply(5,5));
        //System.out.println(divide(25,5));
        //System.out.println(remainder(5,2));
        factorial();
        //rollDice();
    }

    public static int add(int one, int two){
        return one + two;
    }

    public static int subtract(int one, int two){
        return one - two;
    }

    public static int multiply(int one, int two){
        return one * two;
    }

    public static int divide(int one, int two){
        return one / two;
    }

    public static int remainder(int one, int two){
        return one % two;
    }

    public static void factorial(){
        int userEntry;
        long answer = 1L;
        String factorialString;
        userEntry = promptForNumber();
        factorialString = userEntry + "! = " + userEntry;           //second userEntry needs replaced with "1" for for loop and big recursive
        /*for(int i = 2; i <= userEntry; i++){      //for loop method
            answer = answer * i;
            factorialString = factorialString + " x " + i;
        }*/
        //System.out.println(factorialString + " = " + answer); //for loop method
        /*int i = 2;        //big recursive method
        System.out.println(recursiveFactorial(answer, factorialString, userEntry, i));*/        //big recursive method
        answer = recurFactorialAnswer(userEntry, answer);       //broken up recursive method
        factorialString = recurFactorialString(userEntry - 1, factorialString) + " x 1";        //broken up recursive method
        System.out.println(factorialString + " = " + answer);       // broken up recursive method
        if(keepGoing().equalsIgnoreCase("y")){
            factorial();
        }
    }

    public static long recurFactorialAnswer(int userEntry, long answer){
        if (userEntry > 1){
            answer = (answer * userEntry) +'L';
            return recurFactorialAnswer(userEntry - 1, answer);
        } else{
            return answer;
        }
    }

    public static String recurFactorialString(int userEntry, String factorialString){
        if(userEntry > 1){
            factorialString = factorialString + " x " + userEntry;
            return recurFactorialString(userEntry - 1, factorialString);
        } else {
            return factorialString;
        }
    }

    public static String recursiveFactorial(long answer, String factorialString, int userEntry, int i){
        if(i <= userEntry){
            answer = answer * i;
            factorialString = factorialString + " x " + i;
        }
        if (i == userEntry){
            return factorialString + " = " + answer;
        } else {
            return recursiveFactorial(answer, factorialString, userEntry, i + 1);
        }
    }

    public static int promptForNumber(){
        int userEntry;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1-20: ");
        userEntry = sc.nextInt();
        if (userEntry >=1 && userEntry <= 20){
            return userEntry;
        }
        return promptForNumber();
    }

    public static String keepGoing(){
        Scanner sc = new Scanner(System.in);
        String keepGoing;
        System.out.print("Would you like to continue?(y/n): ");
        keepGoing = sc.next();
        return keepGoing;
    }



    public static void rollDice(){
        Random randomGenerator = new Random();
        int dieSides;
        int dieOne;
        int dieTwo;
        dieSides = promptForDice();
        //dieOne = dieRoll(dieSides);
        //dieTwo = dieRoll(dieSides);
        dieOne = randomGenerator.nextInt((dieSides - 1)) + 1;
        dieTwo = randomGenerator.nextInt((dieSides - 1)) + 1;
        System.out.println("You rolled a " + dieOne + " and a " + dieTwo);
        if(keepGoing().equalsIgnoreCase("y")){
            rollDice();
        }
    }

    public static int promptForDice(){
        Scanner sc = new Scanner(System.in);
        int userEntry;
        System.out.print("How many sides do your die have: ");
        userEntry = sc.nextInt();
        return userEntry;
    }

    public static int dieRoll(int numberOfSides){
        return (int) Math.floor(Math.random() * numberOfSides) + 1;
    }
}
